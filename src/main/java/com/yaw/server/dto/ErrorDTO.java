package com.yaw.server.dto;

import java.time.LocalDateTime;

public record ErrorDTO(String message, LocalDateTime timestamp, Integer status) {
}
