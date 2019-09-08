package com.shuzzzle.mercurii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@SpringBootApplication
public class MercuriiApplication {

    public static void main(String[] args) {
        System.out.println(System.getProperty("CHICKEN213213"));
        SpringApplication.run(MercuriiApplication.class, args);
    }

    @Bean
    public DataSource dataSource()
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mercurii");
        dataSource.setUsername("root");
        dataSource.setPassword("test");
        return dataSource;
    }

}
