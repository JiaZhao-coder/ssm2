package com.shop.utils.exception;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//只不过这是在这种是使用 注解 注册的bean,不是在springXxx.xml里配置的
//这个只拦截异常，不拦截404错误
//@Component ,先注释掉 免得错误都看不到 先注释掉 免得 各种错误被拦截到了不好,这样才晓得出错在哪儿了
public class InterceptGlobalException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {


        String msg2 = "程序员正在紧急修改bug中";

        //if (e instanceof MyException) {

        //   msg2 = ((MyException) e).getMsg();

        // }


        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("errorMsg", msg2);

        modelAndView.setViewName("error");

        return modelAndView;
    }
}
