//package com.yasser.registry.Eureka.server.config.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@EnableWebSecurity
//@EnableMethodSecurity(jsr250Enabled = true , securedEnabled = true , prePostEnabled = true)
//public class OAuth2ClientSecurityConfig {
//
//	@Bean
//	protected SecurityFilterChain configure(HttpSecurity http) throws Exception {
//
//		http.csrf()
//			.disable()
//			.authorizeRequests()
//			.requestMatchers("/eureka/**").permitAll()
//			.requestMatchers("/api/logout").authenticated()
//			.requestMatchers("/dashboard").authenticated()
//			//                .antMatchers("/dashboard").hasAuthority("ROLE_AADMIN")
//			.requestMatchers("/v2/api-docs/**").permitAll()
//			.anyRequest().authenticated()
//			.and().oauth2Login();
//
//		return http.build();
//	}
//}