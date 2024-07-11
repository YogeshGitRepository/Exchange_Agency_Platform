package com.exchangeagency.utils;

import com.exchangeagency.model.Item;

public class Validation {

    public static boolean isValidItem(Item item) {
        if (item == null) {
            return false;
        }

        return isNotNullOrEmpty(item.getName()) &&
isNotNullOrEmpty(item.getCategory()) &&
isNotNullOrEmpty(item.getBrand()) &&
isNotNullOrEmpty(item.getFeatures()) &&
isNotNullOrEmpty(item.getDescription()) &&
isNotNullOrEmpty(item.getCondition()) &&
item.getPhoto() != null && item.getPhoto().length > 0 &&
item.getUserId() > 0;
    }

    private static boolean isNotNullOrEmpty(String value) {
        return value != null && !value.isEmpty();
    }
}
