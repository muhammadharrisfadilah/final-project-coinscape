package com.project.coinscape.service.impl;

import com.project.coinscape.entities.Role;
import com.project.coinscape.entities.constants.ERole;
import com.project.coinscape.repository.RoleRepository;
import com.project.coinscape.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    @Override
    public Role getOrSave(ERole role) {
        return roleRepository.findByRole(role).orElseGet(() -> roleRepository.save(Role.builder()
                        .role(role)
                .build()));
    }
}
