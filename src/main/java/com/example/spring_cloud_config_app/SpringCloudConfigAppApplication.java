package com.example.spring_cloud_config_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigAppApplication.class, args);
    }

}
