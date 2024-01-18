/*
package com.the_daul_intra.mini.configuration;

import com.the_daul_intra.mini.service.ApiEmpService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {

    private final ApiEmpService apiEmpService;
    @Value("${jwt.secret}")
    private String secretKey;
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                //이해하기
                .httpBasic().disable()
                .csrf().disable()
                .cors().and()
                .authorizeHttpRequests(requests -> {
                    requests.requestMatchers("/api/bbs/deactive", "/api/bbs/deactive/**").hasAuthority("ROLE_ADMIN");
                    requests.anyRequest().permitAll();
//                    requests.requestMatchers("api/bbs/**").authenticated();
                })
                .sessionManagement(
                        sessionManagement ->
                                sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                )
                */
/*.addFilterBefore(new JwtFilter(apiEmpService, secretKey), UsernamePasswordAuthenticationFilter.class)*//*

                .build();
    }
}*/
