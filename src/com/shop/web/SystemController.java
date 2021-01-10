package com.shop.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//这最好也写过request maping好些
public class SystemController {

    @RequestMapping(value = "/tologin")//这个类似原生的那个servlet 上面的url
    //也默认到了web，war_exployed,的目录下，类似servlet上面的那些
    //虚拟路径,类别xuexi
    //最开始的访问url,直接可以访问web-inf里面的，因为
    //mvc是通过前端控制器 front controller它有这个功能(类似原生servlet里面的RequestDispatcher的
    // 转发功能，因为对RequestDispatcher来说web-inf里面的时可见的 )，
    // dispatcherServlet
    public String toLogin() {

        return "login";//配置了视图解析器来了的,其实底层就是转发的封装
        //这个地址栏没发生变化，只是将这个视图显示出来，毕竟式@requestmaping的那个
        //才算请求，也没用重定向，类似原生servlet的转发，一个 请求来了，我帮你转发

    }


}
