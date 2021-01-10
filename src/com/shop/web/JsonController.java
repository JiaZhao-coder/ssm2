package com.shop.web;


import com.shop.pojo.Product;
import com.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JsonController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<Product> getJsonList() {

        List<Product> productList = productService.getProductList();

        return productList;

    }


}
