package br.com.clean_architecture_javaapi.infra.controllers.exception;

import org.springframework.http.HttpStatus;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ErrorMessage {
    
    private String message;
    private String status;
    private int statusCode;
    private String path;

    public ErrorMessage(HttpStatus status, HttpServletRequest request, String message) {
        this.message = message;
        this.statusCode = status.value();
        this.status = status.getReasonPhrase();
        this.path = request.getRequestURI();
    }

}
