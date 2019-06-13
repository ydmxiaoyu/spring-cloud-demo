package com.example.registereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * @author yudaoming
 */
@SpringBootApplication
@EnableEurekaServer
public class RegisterEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegisterEurekaApplication.class, args);
	}

}
