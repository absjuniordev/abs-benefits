package com.absjrdev.absbenefits.user.dto;

import com.absjrdev.absbenefits.user.domain.Role;
import com.absjrdev.absbenefits.user.domain.User;

public record UserResponseDTO(
        Long id,
        String name,
        String email,
        Role role
) {

    public static UserResponseDTO from(User user) {
        return new UserResponseDTO(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getRole()
        );
    }
}