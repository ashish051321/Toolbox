package com.egnosistek.compmodservice.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyCustomWebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/compmod/**")
                .addResourceLocations("classpath:/resources/compmod-ui/"); // the directory where the Angular app compiled files are located
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/compmod/").setViewName("forward:/compmod/index.html");
    }
}
