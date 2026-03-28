package com.satyam.ecommerce_backend.service;

import com.satyam.ecommerce_backend.dto.AuthResponse;
import com.satyam.ecommerce_backend.dto.LoginRequest;
import com.satyam.ecommerce_backend.dto.RegisterRequest;

public interface AuthService  {
    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
}
