package com.scent.perfume.domain.auth.dto;

import com.scent.perfume.domain.user.entity.Role;

public record AuthResponse(
        Role role,
        String token
) {
    public AuthResponse of(Role role, String token) {
        return new AuthResponse(role, token);
    }
}
