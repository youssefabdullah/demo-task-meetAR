package com.meetAr.demo.service;

import com.meetAr.demo.entity.Product;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

public interface ProductService {
    Product createProduct(Product product);

    Optional<Product> getProductById(Integer id);

    List<Product> getAllProducts(Pageable pageable);

    Product updateProduct(Integer id, Product updatedProduct);

    void deleteProduct(Integer id);
}
