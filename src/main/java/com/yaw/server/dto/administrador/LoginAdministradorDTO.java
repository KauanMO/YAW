package com.yaw.server.dto.administrador;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LoginAdministradorDTO(
        @NotBlank
        @NotNull
        String login,
        @NotBlank
        @NotNull
        String senha
) {
}
