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

@WebServlet(name = "ItemServlet", urlPatterns = {"/items"})
public class ItemServlet extends HttpServlet {
    private ItemDAO itemDAO;

    @Override
    public void init() {
        itemDAO = new ItemDAO();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        String brand = request.getParameter("brand");
        String features = request.getParameter("features");

        Item item = new Item();
        item.setName(name);
        item.setCategory(category);
        item.setBrand(brand);
        item.setFeatures(features);

        if (Validation.isValidItem(item)) {
            itemDAO.addItem(item);
            response.sendRedirect("listItems");
        } else {
            response.getWriter().write("Invalid item details");
        }
    }
}
