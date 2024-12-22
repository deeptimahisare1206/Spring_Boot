package com.mypackage.secure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	
	
//	for different passwords of user and admin 
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails normal = User.withUsername("normal").password(passwordEncoder().encode("1234")).roles("NORMAL").build();
		UserDetails admin = User.withUsername("admin").password(passwordEncoder().encode("5678")).roles("ADMIN").build();
		
		return new InMemoryUserDetailsManager(normal,admin);
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {

		httpSecurity.csrf().disable().authorizeHttpRequests().requestMatchers("/index/normal").hasRole("NORMAL").requestMatchers("/index/admin").hasRole("ADMIN").requestMatchers("/index/public").permitAll().anyRequest()
				.authenticated().and().formLogin();

		return httpSecurity.build();
	}
}
