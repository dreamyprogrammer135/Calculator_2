package com.dreamyprogrammer.calculator_2;

import java.io.Serializable;

public class StoredExpression implements Serializable {
    private String storedExpression;

    public String getStoredExpression() {
        return storedExpression;
    }

    public void setStoredExpression(String storedExpression) {
        this.storedExpression = storedExpression;
    }
}
