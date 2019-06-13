package com.jrm.ydm.eurekaprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者
 * @author yudaoming
 */
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaProviderApplication.class, args);
	}

}
