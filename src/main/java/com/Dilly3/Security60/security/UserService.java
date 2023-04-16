package com.Dilly3.Security60.service;

import com.Dilly3.Security60.models.AppUSer;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
    private final PasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(username.equals("michael")){
            var user = new AppUSer();
            user.setUsername("michael");
            user.setPassword(encoder.encode("12345"));
            user.setEmail("michael@gmail.com");
            return user;
        }else{
            throw new UsernameNotFoundException("username not found");
        }
    }
}
