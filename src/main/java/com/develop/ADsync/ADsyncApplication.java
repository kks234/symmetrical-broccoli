package com.develop.ADsync;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan(basePackages = {"com.develop.ADsync"})
public class ADsyncApplication {
	public static void main(String[] args) {
		SpringApplication.run(ADsyncApplication.class, args);
	}
}
