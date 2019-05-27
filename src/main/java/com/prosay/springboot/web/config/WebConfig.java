package com.prosay.springboot.web.config;

import com.prosay.springboot.web.servlet.DemoServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {

    //springboot整合servlet,filter,listener第一种方式(自定义的servlet上不用加相应的注解)
   /* @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new DemoServlet(), "/demo");
    }*/

    /*@Bean
    public FilterRegistrationBean filterRegistrationBean() {

        return new FilterRegistrationBean();
    }*/
}
