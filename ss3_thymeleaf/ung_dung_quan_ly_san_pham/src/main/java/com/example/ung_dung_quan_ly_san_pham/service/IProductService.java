package com.example.ung_dung_quan_ly_san_pham.service;

import com.example.ung_dung_quan_ly_san_pham.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    Product getProductById(int id);
    void addProduct(Product product);
    void updateProduct(Product product);
    void deleteProduct(int id);
}
