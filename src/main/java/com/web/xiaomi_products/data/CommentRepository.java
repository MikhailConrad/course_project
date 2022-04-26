package com.web.xiaomi_products.data;

import com.web.xiaomi_products.entity.Comment;
import com.web.xiaomi_products.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer> {

    List<Comment> findAllByProduct(Product product);
}
