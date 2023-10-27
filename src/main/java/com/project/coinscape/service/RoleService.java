package com.project.coinscape.service;

import com.project.coinscape.entities.Role;
import com.project.coinscape.entities.constants.ERole;

public interface RoleService {
    Role getOrSave(ERole role);
}
