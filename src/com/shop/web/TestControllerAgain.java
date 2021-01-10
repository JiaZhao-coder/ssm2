package com.shop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestControllerAgain {
    @RequestMapping(value = "/testgg")//最开始的访问url
    public String toLogin() {

        return "login";//相当于原生的请求转发了一个jsp,所以地址栏不变
    }
}
