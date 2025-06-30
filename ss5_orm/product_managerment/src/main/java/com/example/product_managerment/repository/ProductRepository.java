package com.example.product_managerment.repository;

import com.example.product_managerment.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductRepository implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1, "Samsung", 15000000, "LikeNew", "Samsung"));
        productList.add(new Product(2, "Iphone 12", 20000000, "New", "Apple"));
        productList.add(new Product(3, "Iphone 13", 25000000, "New", "Apple"));
        productList.add(new Product(4, "Iphone 14", 30000000, "New", "Apple"));
    }

    @Override
    public List<Product> getAllProducts() {
        return productList;
    }

    @Override
    public Product getProductById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void addProduct(Product product) {
        productList.add(product);
    }

    @Override
    public void updateProduct(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
            }
        }
    }

    @Override
    public void deleteProduct(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
            }
        }
    }
}
