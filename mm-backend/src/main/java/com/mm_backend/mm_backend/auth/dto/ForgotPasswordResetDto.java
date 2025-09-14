package com.mm_backend.mm_backend.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record ForgotPasswordResetDto(
        @Email
        String email,
        @NotBlank
        String forgotToken,
        @NotBlank
        String newPassword
) {}
