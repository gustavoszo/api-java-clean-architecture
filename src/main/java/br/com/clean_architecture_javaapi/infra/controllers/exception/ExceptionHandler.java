package br.com.clean_architecture_javaapi.infra.controllers.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import br.com.clean_architecture_javaapi.core.exceptions.BusinessException;
import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(BusinessException.class) 
    public ResponseEntity<ErrorMessage> businessException(RuntimeException ex, HttpServletRequest request) {
        return ResponseEntity
            .status(HttpStatus.CONFLICT)
            .contentType(MediaType.APPLICATION_JSON)
            .body(new ErrorMessage(HttpStatus.CONFLICT, request, ex.getMessage()));
    }

}