package com.endeymus.carsharing.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable();
        http
                .authorizeRequests()
                .antMatchers("/css/**").permitAll()
                .antMatchers("/**").authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll()
                .and()
                .logout().logoutSuccessUrl("/");
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(
                User.builder()
                        .username("Operator345")
                        .password(passwordEncoder().encode("Operator345"))
                        .roles("ADMIN")
                        .build(),
                User.builder()
                        .username("Operator136")
                        .password(passwordEncoder().encode("Operator136"))
                        .roles("ADMIN")
                        .build(),
                User.builder()
                        .username("Operator953")
                        .password(passwordEncoder().encode("Operator953"))
                        .roles("ADMIN")
                        .build(),
                User.builder()
                        .username("Operator741")
                        .password(passwordEncoder().encode("Operator741"))
                        .roles("ADMIN")
                        .build(),
                User.builder()
                        .username("Operator753")
                        .password(passwordEncoder().encode("Operator753"))
                        .roles("ADMIN")
                        .build(),
                User.builder()
                        .username("Operator361")
                        .password(passwordEncoder().encode("Operator361"))
                        .roles("ADMIN")
                        .build(),
                User.builder()
                        .username("Operator159")
                        .password(passwordEncoder().encode("Operator159"))
                        .roles("ADMIN")
                        .build(),
                User.builder()
                        .username("Operator357")
                        .password(passwordEncoder().encode("Operator357"))
                        .roles("ADMIN")
                        .build(),
                User.builder()
                        .username("Operator963")
                        .password(passwordEncoder().encode("Operator963"))
                        .roles("ADMIN")
                        .build(),
                User.builder()
                        .username("Operator789")
                        .password(passwordEncoder().encode("Operator789"))
                        .roles("ADMIN")
                        .build()
                );
    }
}
