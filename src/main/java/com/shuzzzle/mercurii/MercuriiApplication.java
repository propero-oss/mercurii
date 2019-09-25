package com.shuzzzle.mercurii;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Configuration
@RestController
@SpringBootApplication
public class MercuriiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MercuriiApplication.class, args);
        log.info("visit http://127.0.0.1:8080/api/ resp. http://127.0.0.1:8080/browse/ in your browser");
    }

    @Bean
    public PasswordEncoder getPasswordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

}
