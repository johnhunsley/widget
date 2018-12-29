package com.johnhunsley.widget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author jphunsley@gmail.com
 *         Date : 15/11/2016
 *         Time : 09:55
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args)  {
        SpringApplication.run(Application.class, args);
    }
}
