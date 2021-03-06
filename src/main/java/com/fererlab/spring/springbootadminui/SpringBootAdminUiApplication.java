package com.fererlab.spring.springbootadminui;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@EnableAdminServer
@SpringBootApplication
public class SpringBootAdminUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAdminUiApplication.class, args);
    }

}
