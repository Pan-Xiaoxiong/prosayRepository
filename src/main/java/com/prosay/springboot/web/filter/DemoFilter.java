package com.prosay.springboot.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//springboot整合servlet,filter,listener第三种方式，官方推荐方式，(自定义的servlet上要加相应的注解)
@WebFilter(filterName = "DemoFilter",urlPatterns = "/*")
public class DemoFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("DemoFilter------init()");
    }

    @Override
    public void destroy() {
        System.out.println("DemoFilter------destroy()");
    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        System.out.println("DemoFilter-----doFilter()");
        filterChain.doFilter(request,response);
    }
}
