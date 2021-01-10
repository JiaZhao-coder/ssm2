package com.shop.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @RequestMapping(value = "/login")//不写method的话， login太快了，直接重定向了，因为里面又写重定向
    public String login(String userName, String passWord, HttpSession httpSession) {

        if ("admin".equals(userName) && "admin".equals(passWord)) {
            //这儿的目的是为了拦截不登录就看商品的人
            httpSession.setAttribute("userName", userName);

            return "redirect:/product";//web层 mvc的重定向写法，类似原生的servlet
            //转发""
            //重定向到这个资源上 /product

        }

        return "login";//账号密码错误，又回到登陆页面,这还是string，,没得提示，如果不写这个
        //虽然你觉得还是元页面，但 就停在这里了,还是写起这个
        //前后缀还有这个作用,在浏览器端看不到这到底是啥页面,login有时候也可能出现在地址栏
        //我记得还有modelandview，和void，string

    }

}
