package com.shop.utils.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//直接实现这个接口,在spring mvc.xml 里面还要配置它 才能起效果,只不过这是在spring mvc.xml里配置的
//只在访问 类selet url mapping 资源时 才促发,不像 filter  i系统默认的index都触发了 拦截
//这个 拦截 只拦截 类似 selt url mapping 那些 ,web-inf不用它拦截,只拦截 虚拟资源,静态资源 图片这些拦不住
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String uri = request.getRequestURI();
        if (uri.endsWith("login")) {
            return true;

        }

        if (null != request.getSession().getAttribute("userName")) {


            return true;

        }

        request.getRequestDispatcher("\\WEB-INF\\jsp\\login.jsp").forward(request, response);
        //response.sendRedirect("/tologin");
        //难怪是转发的,


        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
