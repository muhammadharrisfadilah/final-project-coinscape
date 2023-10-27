package com.project.coinscape.service;


import com.project.coinscape.models.requests.user.UpdateUserRequest;
import com.project.coinscape.models.responses.transaction.TransactionResponse;
import com.project.coinscape.models.responses.user.UserResponse;

import java.util.List;

public interface UserService {
    UserResponse getUserById(String userId);
    List<TransactionResponse> getAllTransaction(String userId);
    UserResponse updateUser(UpdateUserRequest request);
}
