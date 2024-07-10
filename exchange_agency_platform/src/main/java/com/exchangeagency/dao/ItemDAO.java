package com.exchangeagency.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.exchangeagency.model.Item;

public class ItemDAO {
    private Connection connection;

    public ItemDAO() {
        connection = DatabaseConnection.getConnection();
    }

    public List<Item> getAllItems() {
        List<Item> items = new ArrayList<>();
        String query = "SELECT * FROM Items";

        try (Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                Item item = extractItemFromResultSet(resultSet);
                items.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    private Item extractItemFromResultSet(ResultSet resultSet) throws SQLException {
        Item item = new Item();
        item.setId(resultSet.getInt("id"));
        item.setCategory(resultSet.getString("category"));
        item.setName(resultSet.getString("name"));
        item.setBrand(resultSet.getString("brand"));
        item.setFeatures(resultSet.getString("features"));
        item.setDescription(resultSet.getString("description"));
        item.setCondition(resultSet.getString("condition"));
        item.setPhoto(resultSet.getBytes("photo"));
        item.setUserId(resultSet.getInt("user_id"));
        item.setCreatedAt(resultSet.getTimestamp("created_at"));
        item.setUpdatedAt(resultSet.getTimestamp("updated_at"));
        return item;
    }

    public void addItem(Item item) {
        String query = "INSERT INTO Items (category, name, brand, features, description, condition, photo, user_id) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            setItemParameters(preparedStatement, item);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Item getItemById(int id) {
        Item item = null;
        String sql = "SELECT * FROM Items WHERE id = ?";

        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                item = extractItemFromResultSet(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    public void updateItem(Item item) {
        String query = "UPDATE Items SET category = ?, name = ?, brand = ?, features = ?, description = ?, condition = ?, photo = ?, user_id = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            setItemParameters(preparedStatement, item);
            preparedStatement.setInt(9, item.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteItem(int id) {
        String query = "DELETE FROM Items WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void setItemParameters(PreparedStatement preparedStatement, Item item) throws SQLException {
        preparedStatement.setString(1, item.getCategory());
        preparedStatement.setString(2, item.getName());
        preparedStatement.setString(3, item.getBrand());
        preparedStatement.setString(4, item.getFeatures());
        preparedStatement.setString(5, item.getDescription());
        preparedStatement.setString(6, item.getCondition());
        preparedStatement.setBytes(7, item.getPhoto());
        preparedStatement.setInt(8, item.getUserId());
    }
}
