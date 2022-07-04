package com.javastart.hellospring.exception;

import com.javastart.hellospring.entity.Account;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CastomExceptionHandler extends ResponseEntityExceptionHandler {

        @ResponseStatus(HttpStatus.NOT_FOUND)
        @ExceptionHandler(AccountNotFoundException.class)
        public ResponseEntity<Object> handleConflict() {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
}
