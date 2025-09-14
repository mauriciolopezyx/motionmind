package com.mm_backend.mm_backend.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record LoginUserDto(
        @Email String email,
        @NotBlank String password
) {}
