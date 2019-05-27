package com.prosay.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//springboot整合servlet,filter,listener第三种方式，官方推荐方式，(自定义的servlet上要加相应的注解)
@ServletComponentScan(basePackages = {"com.prosay.springboot.web"})
public class SpringBootThymeleafApplication  {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootThymeleafApplication.class, args);
    }

}


//springboot整合servlet,filter,listener第二种方式(自定义的servlet上不用加相应的注解)
/*@SpringBootApplication
public class SpringBootThymeleafApplication implements ServletContextInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootThymeleafApplication.class, args);
    }

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.addServlet("DemoServlet", new DemoServlet()).addMapping("/demo");
    }
}*/
