package com.the_daul_intra.mini.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    EMAIL_DUPLICATED(HttpStatus.CONFLICT,""),
    NOT_FOUND(HttpStatus.NOT_FOUND, ""),
    INVALID_PASSWORD(HttpStatus.UNAUTHORIZED,""),
    UNAUTHORIZED(HttpStatus.UNAUTHORIZED,""),
    INVALID_OPERATION(HttpStatus.METHOD_NOT_ALLOWED,"");

    private HttpStatus httpStatus;
    private String message;
}
