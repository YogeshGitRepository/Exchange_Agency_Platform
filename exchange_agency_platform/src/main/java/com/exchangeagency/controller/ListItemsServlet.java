package com.exchangeagency.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exchangeagency.dao.ItemDAO;
import com.exchangeagency.model.Item;

@WebServlet(name = "ListItemsServlet", urlPatterns = {"/listItems"})
public class ListItemsServlet extends HttpServlet {
    private ItemDAO itemDAO;

    @Override
    public void init() throws ServletException {
        super.init();
        itemDAO = new ItemDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Item> items = itemDAO.getAllItems();
        if (items.isEmpty()) {
            request.setAttribute("noItemsMessage", "No items found in the database.");
        }
        request.setAttribute("items", items);
        request.getRequestDispatcher("listItems.jsp").forward(request, response);
    }
}
