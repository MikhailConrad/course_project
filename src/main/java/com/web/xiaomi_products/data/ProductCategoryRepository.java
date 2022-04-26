package com.web.xiaomi_products.data;

import com.web.xiaomi_products.entity.ProductCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends CrudRepository<ProductCategory, Integer> {

    ProductCategory findByCategoryName(String categoryName);
}
