package com.web.xiaomi_products.data;

import com.web.xiaomi_products.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    Product findByProductName(String productName);
}
