package com.week_nine.Exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAlreadyExists extends RuntimeException{
    private String debugMessage;

    public UserAlreadyExists(String message){
        super(message);
    }
}
