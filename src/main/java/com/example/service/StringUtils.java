package com.example.service;

public class StringUtils {

    public boolean isPositiveNumber(String str) {
        boolean isDigit = str.matches("-?\\d+(\\.\\d+)?");
        return  (isDigit && Double.parseDouble(str) > 0);
    }
}
