package com.shop.web;


import com.shop.pojo.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;


@Controller
public class TestSendAjax {


    @RequestMapping(value = "/sendJson.action", method = RequestMethod.POST)
    @ResponseBody  //这是返回给前端的json写法,字符串也可以,文本之类的都可以
    //加了@ResponseBody这个注解就可以不受限制,可以传文本了
    public Product sendAjax(@RequestBody Product product) throws IOException {
        //@RequestBody要跟@pathVariable区分开来这是restful风格,主要接收 /sendJson.action/{uid}这种


        //@RequestBody ,前端传来的json接收写法
        System.out.println(product.getName());
//        Product product2 = new Product();
//        product2.setName("电脑2");
//        product2.setPrice((double) 4900);

        return product;//直接就将resonse的工作取代了


    }


}
