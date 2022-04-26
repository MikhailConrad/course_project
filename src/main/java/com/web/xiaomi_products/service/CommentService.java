package com.web.xiaomi_products.service;

import com.web.xiaomi_products.data.CommentRepository;
import com.web.xiaomi_products.data.ProductCategoryRepository;
import com.web.xiaomi_products.data.ProductRepository;
import com.web.xiaomi_products.data.UserRepository;
import com.web.xiaomi_products.entity.Comment;
import com.web.xiaomi_products.entity.CommentForProduct;
import com.web.xiaomi_products.entity.Product;
import com.web.xiaomi_products.entity.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CommentService {

    private CommentRepository commentRepository;
    private UserRepository userRepository;
    private ProductRepository productRepository;
    private ProductCategoryRepository productCategoryRepository;

    @Autowired
    public CommentService (CommentRepository commentRepository, UserRepository userRepository,
                           ProductRepository productRepository, ProductCategoryRepository productCategoryRepository) {
        this.commentRepository = commentRepository;
        this.userRepository = userRepository;
        this.productRepository = productRepository;
        this.productCategoryRepository = productCategoryRepository;
    }

    public Map<Product, List<Comment>> getCommentsForCategory(String categoryName) {

        ProductCategory productCategory = productCategoryRepository.findByCategoryName(categoryName);

        List<Product> products = productCategory.getProducts();

        Map<Product, List<Comment>> commentsForCategory = new HashMap<>();

        for (Product product: products) {
            List<Comment> commentsForProduct = product.getComments();
            commentsForCategory.put(product, commentsForProduct);
        }

        return commentsForCategory;
    }

    public void addNewComment(CommentForProduct newCommentForProduct, String username) {

        Comment newComment = new Comment();
        newComment.setUser(userRepository.findByUsername(username));
        newComment.setMessage(newCommentForProduct.getMessage());
        newComment.setProduct(productRepository.findByProductName(newCommentForProduct.getProductName()));
        commentRepository.save(newComment);
    }
}
