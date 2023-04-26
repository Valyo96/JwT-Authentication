package com.auth.JwTAuthentication.security;

import lombok.Data;

@Data
public class JWTAuthenticationRequest {
    private String email;

    private String password;
}
