package com.szczeprez.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.szczeprez.springboot.configuration.JpaConfiguration;

@Import(JpaConfiguration.class)
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages={"com.szczeprez.springboot"})
public class SpringBootAgJsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAgJsApplication.class, args);
	}
}
