package com.mm_backend.mm_backend.user.dto;

import jakarta.validation.constraints.NotBlank;

public record ResetPasswordDto(
        @NotBlank
        String oldPassword,
        @NotBlank
        String newPassword
) {}
