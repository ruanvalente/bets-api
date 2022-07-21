package com.bets.api.exceptions;

import org.springframework.http.HttpStatus;

public class BetsException extends RuntimeException{
    private final HttpStatus httpStatus;
    private String messageDetail;

    public BetsException(HttpStatus httpStatus, String message, String messageDetail) {
        super (message);
        this.httpStatus = httpStatus;
        this.messageDetail = messageDetail;
    }

    public BetsException(HttpStatus httpStatus, String message) {
        super (message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getStatus() {
        return httpStatus;
    }

    public String getMessageDetail() {
        return messageDetail;
    }
}
