package com.undisputedmaster.fatboy.security.model;

import java.time.LocalDateTime;

/**
 * Created by Swapnil.Khandizod on 27-06-2018.
 */
public class LoginResponse {
    private String token;
    private boolean response;
    private String message;
    private LocalDateTime timestamp;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LoginResponse(String token, boolean response,String message){
        this.token=token;
        this.response=response;
        this.message=message;
        this.timestamp=LocalDateTime.now();
    }
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
