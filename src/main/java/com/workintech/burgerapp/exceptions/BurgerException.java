package com.workintech.burgerapp.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BurgerException extends RuntimeException{
    private HttpStatus status;

    public BurgerException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
