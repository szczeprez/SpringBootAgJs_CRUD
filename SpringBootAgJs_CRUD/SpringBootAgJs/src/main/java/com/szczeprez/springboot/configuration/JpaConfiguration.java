package com.szczeprez.springboot.configuration;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.szczeprez.springboot.repositories",
		entityManagerFactoryRef = "entityManagerFactory",
		transactionManagerRef = "transactionManager")
@EnableTransactionManagement
public class JpaConfiguration {

	@Bean
	public DataSourceProperties dataSourceProperties(){
		return new DataSourceProperties(); 
	}
}
