package com.exchangeagency.utils;

import com.exchangeagency.model.Item;

public class Validation {

    public static boolean isValidItem(Item item) {
        if (item.getName() == null || item.getName().isEmpty()) {
            return false;
        }
        if (item.getCategory() == null || item.getCategory().isEmpty()) {
            return false;
        }
        if (item.getBrand() == null || item.getBrand().isEmpty()) {
            return false;
        }
        if (item.getFeatures () == null || item.getFeatures().isEmpty()) {
            return false;
        }
        if (item.getDescription() == null || item.getDescription().isEmpty()) {
            return false;
        }
        if (item.getCondition() == null || item.getCondition().isEmpty()) {
            return false;
        }
        if (item.getPhoto() == null || item.getPhoto().length == 0) {
            return false;
        }
        if (item.getUserId() <= 0) {
            return false;
        }
        return true;
    }
}
