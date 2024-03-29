package com.javastart.hellospring.exception;

import com.javastart.hellospring.controller.dto.NotFoundExceptionDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CastomExceptionHandler extends ResponseEntityExceptionHandler {
        @ExceptionHandler(AccountNotFoundException.class)
        public ResponseEntity<Object> handleConflict(AccountNotFoundException ex) {
                return new ResponseEntity<>((new NotFoundExceptionDTO(ex.getLocalizedMessage())), HttpStatus.NOT_FOUND);
        }
}



