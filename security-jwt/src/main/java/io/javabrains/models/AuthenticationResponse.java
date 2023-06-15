package io.javabrains.models;

public class AuthenticationResponse {

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    private final String jwt;

    public String getJwt() {
        return jwt;
    }
}
