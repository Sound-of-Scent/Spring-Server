package com.scent.perfume.domain.auth.dto;

import com.scent.perfume.domain.user.entity.Role;

public record AuthRequest(
        Role role,
        String password
) {
    public record updatePassword(String newPassword) { }
}
