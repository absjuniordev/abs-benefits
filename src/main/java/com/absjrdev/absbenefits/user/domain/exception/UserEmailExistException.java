package com.absjrdev.absbenefits.user.domain.exception;

public class UserEmailExistException extends UserException {
    public UserEmailExistException(String message) {
        super("E-mail já cadastrado: " +  message);
    }
}
