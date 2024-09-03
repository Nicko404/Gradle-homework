package com.example.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class StringUtilsTest {

    @Test
    public void testStringUtils() {
        StringUtils stringUtils = new StringUtils();

        assertTrue(stringUtils.isPositiveNumber("23"));
        assertTrue(stringUtils.isPositiveNumber("2.3"));
        assertFalse(stringUtils.isPositiveNumber("0"));
        assertFalse(stringUtils.isPositiveNumber("-23"));
        assertFalse(stringUtils.isPositiveNumber("-2.3"));
        assertFalse(stringUtils.isPositiveNumber("23a"));
        assertFalse(stringUtils.isPositiveNumber("One"));
    }

}