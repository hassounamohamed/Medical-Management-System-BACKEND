package com.Medical.Management.System.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf(csrf -> csrf.disable())  // Disable CSRF if required
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/admin/**").hasRole("ADMIN")  // Define role-based access
                .requestMatchers("/user/**").hasRole("USER")    // Define role-based access
                .anyRequest().authenticated())  // Require authentication for other requests
            .httpBasic(httpBasic -> httpBasic.realmName("MyCustomRealm"));  // Use default HTTP Basic authentication with custom realm
        return http.build();
    }
}
