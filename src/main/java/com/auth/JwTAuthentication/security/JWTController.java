package com.auth.JwTAuthentication.security;

import com.auth.JwTAuthentication.utility.AuthenticateUser;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/authenticate")
public class JWTController {

    private final JWTService jwtService;

    private final AuthenticateUser check;

    @PostMapping
    public String getTokenForAuthenticatedUser(@RequestBody JWTAuthenticationRequest authRequest){
        check.isUserAuthenticated(authRequest);
        return jwtService.getGeneratedToken(authRequest.getEmail());
    }
}
