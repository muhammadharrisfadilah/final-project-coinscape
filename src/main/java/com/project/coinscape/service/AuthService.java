package com.project.coinscape.service;


import com.project.coinscape.models.requests.auth.AuthRequest;
import com.project.coinscape.models.responses.auth.LoginResponse;
import com.project.coinscape.models.responses.auth.RegisterResponse;

public interface AuthService {
    RegisterResponse registerUser(AuthRequest request);
    RegisterResponse registerAdmin(AuthRequest request);
    LoginResponse loginUser(AuthRequest request);
}
