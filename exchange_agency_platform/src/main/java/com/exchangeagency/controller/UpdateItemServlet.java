package com.exchangeagency.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.exchangeagency.dao.ItemDAO;
import com.exchangeagency.model.Item;
import com.exchangeagency.utils.Validation;

@WebServlet(name = "UpdateItemServlet", urlPatterns = {"/updateItem"})
public class UpdateItemServlet extends HttpServlet {
    private ItemDAO itemDAO;

    @Override
    public void init() {
        itemDAO = new ItemDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int itemId = Integer.parseInt(request.getParameter("id"));
        Item item = itemDAO.getItemById(itemId);
        request.setAttribute("item", item);
        request.getRequestDispatcher("updateItem.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        String brand = request.getParameter("brand");
        String features = request.getParameter("features");

        Item item = new Item();
        item.setId(id);
        item.setName(name);
        item.setCategory(category);
        item.setBrand(brand);
        item.setFeatures(features);

        if (Validation.isValidItem(item)) {
            itemDAO.updateItem(item);
            response.sendRedirect("listItems");
        } else {
            response.getWriter().write("Invalid item details");
        }
    }
}
