package com.project.coinscape.service;

import com.project.coinscape.models.requests.upgrade.UpgradePremiumRequest;
import com.project.coinscape.models.requests.user.SearchUserRequest;
import com.project.coinscape.models.responses.admin.AdminResponse;
import com.project.coinscape.models.responses.upgrade.UpgradeUserToPremiumResponse;
import com.project.coinscape.models.responses.user.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface AdminService {
    List<AdminResponse> getAllAdmins(Pageable pageable);
    Page<UserResponse> getAllUsers(SearchUserRequest request);
    AdminResponse getAdminById(String adminId);
    UpgradeUserToPremiumResponse upgradeUserToPremium(UpgradePremiumRequest request);
}
