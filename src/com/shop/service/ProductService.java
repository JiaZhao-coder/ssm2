package com.shop.service;

import com.shop.pojo.Product;

import java.util.List;

public interface ProductService {

     List<Product> getProductList();


     Product getProductById(Integer id);

    void updateItemById(Product product);
}
