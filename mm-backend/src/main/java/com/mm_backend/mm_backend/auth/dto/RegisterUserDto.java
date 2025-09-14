package com.mm_backend.mm_backend.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record RegisterUserDto(
        @NotBlank String username,
        @NotBlank String password,
        @Email String email
) {}
