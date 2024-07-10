package com.exchangeagency.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.exchangeagency.dao.ItemDAO;
import com.exchangeagency.model.Item;
import com.exchangeagency.utils.Validation;

@WebServlet(name = "AddItemServlet", urlPatterns = {"/addItem"})
@MultipartConfig
public class AddItemServlet extends HttpServlet {
    private ItemDAO itemDAO;

    @Override
    public void init() {
        itemDAO = new ItemDAO();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("addItem.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        String brand = request.getParameter("brand");
        String features = request.getParameter("features");
        String description = request.getParameter("description");
        String condition = request.getParameter("condition");
        int userId = Integer.parseInt(request.getParameter("userId"));
        
        Part photoPart = request.getPart("photo");
        byte[] photo = null;
        if (photoPart != null && photoPart.getSize() > 0) {
            photo = inputStreamToByteArray(photoPart.getInputStream());
        }

        Item item = new Item();
        item.setName(name);
        item.setCategory(category);
        item.setBrand(brand);
        item.setFeatures(features);
        item.setDescription(description);
        item.setCondition(condition);
        item.setPhoto(photo);
        item.setUserId(userId);

        if (Validation.isValidItem(item)) {
            itemDAO.addItem(item);
            response.sendRedirect("listItems");
        } else {
            response.getWriter().write("Invalid item details");
        }
    }

    private byte[] inputStreamToByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        int nRead;
        byte[] data = new byte[16384];
        while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
            buffer.write(data, 0, nRead);
        }
        buffer.flush();
        return buffer.toByteArray();
    }
}
