package com.hungry5656.ecommerce_s.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author: Sizhuo Sun
 * @date: 2024-03-23
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.hungry5656.ecommerce_s"})
//        , excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = GlobalResourceServerConfig.class)})
@EnableFeignClients
@EnableDiscoveryClient
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
