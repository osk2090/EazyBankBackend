package com.eazybytes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests((requests) -> {
                    // hint: 해당 path는 권한 체크할 필요가 없으므로 모든 요청자 호출 가능
                    requests.requestMatchers("/notices", "/contact").permitAll();
                    // hint: 해당 path는 권한이 있는 요청자에게만 호출 가능
                    requests.requestMatchers("/myAccount", "/myBalance", "/myLoans", "/myCards").authenticated();
                }
        );

        http.formLogin(withDefaults());
        http.httpBasic(withDefaults());
        return http.build();
    }

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails admin = User.withDefaultPasswordEncoder().username("admin").password("12345").roles("admin").build();
        UserDetails user = User.withDefaultPasswordEncoder().username("user").password("12345").roles("read").build();
        return new InMemoryUserDetailsManager(admin, user);
    }
}
