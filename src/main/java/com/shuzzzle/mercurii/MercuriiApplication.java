package com.shuzzzle.mercurii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@Configuration
@RestController
@SpringBootApplication
public class MercuriiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MercuriiApplication.class, args);
        System.out.println("visit http://127.0.0.1:8080/api/ resp. http://127.0.0.1:8080/browse/ in your browser");
    }

}
