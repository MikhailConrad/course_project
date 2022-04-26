package com.web.xiaomi_products.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String productName;

    @ManyToOne(targetEntity = ProductCategory.class)
    @JoinColumn(name="category_id", referencedColumnName = "id")
    private ProductCategory category;

    @OneToMany(targetEntity = Comment.class, mappedBy = "product")
    private List<Comment> comments;

    public Product() {
    }

    public Product(int id, String productName, ProductCategory category, List<Comment> comments) {
        this.id = id;
        this.productName = productName;
        this.category = category;
        this.comments = comments;
    }


    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
