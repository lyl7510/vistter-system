package com.base.vistter.system.config;

import com.base.vistter.common.component.RequestHandlerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RequestConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(RequestHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
    }

    @Bean
    public RequestHandlerInterceptor RequestHandlerInterceptor() {
        return new RequestHandlerInterceptor();
    }
}
