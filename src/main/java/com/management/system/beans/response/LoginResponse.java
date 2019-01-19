package com.management.system.beans.response;

public class LoginResponse {

    private String authorization;

    public LoginResponse(String authorization) {
        this.authorization = authorization;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }
}
