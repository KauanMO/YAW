package com.yaw.server.service.exceptions;

import com.yaw.server.dto.ErrorDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(LoginOuSenhaIncorreta.class)
    public ResponseEntity<ErrorDTO> exceptionHandler(LoginOuSenhaIncorreta ex) {
        HttpStatus status = HttpStatus.BAD_REQUEST;

        return ResponseEntity.status(status).body(new ErrorDTO(
                ex.getMessage(), LocalDateTime.now(), status.value()
        ));
    }
}
