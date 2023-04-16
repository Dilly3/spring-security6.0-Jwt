package com.Dilly3.Security60.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception {
        return http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(atr ->
                        atr.requestMatchers(HttpMethod.GET, "/user/**").hasAuthority("USER"))
                .authorizeHttpRequests(atm-> atm.requestMatchers(HttpMethod.GET,"/admin/**").hasAuthority("ADMIN"))
                .authorizeHttpRequests(atm -> atm.requestMatchers("/register/**").permitAll())
                .authorizeHttpRequests(atr -> atr.anyRequest().hasAuthority("USER"))
                .httpBasic(Customizer.withDefaults())
                .build();

    }

    @Bean
    PasswordEncoder BCRYPT(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    AuthenticationManager authman(UserDetailsService userDetailsService){
        System.out.println("in AuthenticationManager ==>");
        DaoAuthenticationProvider dao = new DaoAuthenticationProvider();
        dao.setUserDetailsService(userDetailsService);
        return new ProviderManager(dao);
    }
}
