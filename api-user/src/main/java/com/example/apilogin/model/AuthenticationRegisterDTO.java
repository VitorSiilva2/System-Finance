package com.example.apilogin.model;

public record AuthenticationRegisterDTO(String email, String password, UserRole role) {
}
