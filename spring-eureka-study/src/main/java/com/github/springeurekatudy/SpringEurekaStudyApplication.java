package com.github.springeurekatudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liuyuhu
 * @date 2018/4/18
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaStudyApplication.class, args);
	}
}
