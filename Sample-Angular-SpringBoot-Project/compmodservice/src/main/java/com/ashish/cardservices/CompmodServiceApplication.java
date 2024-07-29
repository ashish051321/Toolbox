package com.egnosistek.compmodservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.egnosistek.compmodservice.graphQl")
public class CompmodServiceApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CompmodServiceApplication.class, args);
    }

    // @Bean
    // public DataSourceTransactionManager transactionManager() {
    // 	return new DataSourceTransactionManager(dataSource());
    // }

}
