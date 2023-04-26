package com.auth.JwTAuthentication.utility;

import com.auth.JwTAuthentication.security.JWTAuthenticationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticateUser {
    private final AuthenticationManager authenticationManager;

    public void isUserAuthenticated(JWTAuthenticationRequest authRequest){
        Authentication authentication = authenticationManager
                .authenticate(new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword()));
        if(!authentication.isAuthenticated()){
            throw new UsernameNotFoundException("Invalid user credentials");
        }
    }
}
