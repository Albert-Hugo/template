package com.ido.zcsd.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {
    private int code = 10000;
    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public int getCode() {
        return code;
    }
}
