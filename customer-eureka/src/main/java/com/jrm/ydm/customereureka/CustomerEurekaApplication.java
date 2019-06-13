package com.jrm.ydm.customereureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 消费者服务
 * @author yudaoming
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class CustomerEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerEurekaApplication.class, args);
	}

}
