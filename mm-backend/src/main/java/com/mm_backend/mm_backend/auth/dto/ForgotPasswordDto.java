package com.mm_backend.mm_backend.auth.dto;

import jakarta.validation.constraints.Email;

public record ForgotPasswordDto(
        @Email String email
) {}