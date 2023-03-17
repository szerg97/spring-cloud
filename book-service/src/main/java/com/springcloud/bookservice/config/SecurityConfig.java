package com.springcloud.bookservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.httpBasic()
                .disable()
            .authorizeHttpRequests()
                .requestMatchers(HttpMethod.GET, "/api/v1/book-service").permitAll()
                .requestMatchers(HttpMethod.GET, "/api/v1/book-service/*").permitAll()
                .requestMatchers(HttpMethod.POST, "/api/v1/book-service").hasRole("ADMIN")
                .requestMatchers(HttpMethod.PUT, "/api/v1/book-service/*").hasRole("ADMIN")
                .requestMatchers(HttpMethod.DELETE, "/api/v1/book-service/*").hasRole("ADMIN")
                .anyRequest().authenticated()
                .and()
            .csrf()
                .disable();
        return http.build();
    }
}
