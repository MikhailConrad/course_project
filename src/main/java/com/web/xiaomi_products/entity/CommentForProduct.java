package com.web.xiaomi_products.entity;

public class CommentForProduct {

    private String productName;

    private String message;

    public CommentForProduct() {
    }

    public CommentForProduct(String productName, String message) {
        this.productName = productName;
        this.message = message;
    }


    //Getters and Setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

