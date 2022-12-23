package io.matoshri.security.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Slf4j
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http)
        throws Exception {
        log.info("=== SecurityConfiguration:filterChain called");
        http
                .formLogin(form -> {
                    form.loginPage("/login")
                            .permitAll();
                })
                .authorizeRequests();
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        log.info("==== SecurityConfiguration:userDetailsService called");
        UserDetails user = User.builder()
                .username("user")
                .password("password")
                .roles("USER")
                .build();
        log.info("==== User: {}", user);
        return new InMemoryUserDetailsManager(user);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        log.info("=== SecurityConfguration:passwordEncodeer called");
        return new BCryptPasswordEncoder();
    }
}
