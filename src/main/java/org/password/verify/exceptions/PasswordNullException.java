package org.password.verify.exceptions;

public class PasswordNullException extends PasswordValidationException{
    public PasswordNullException(String errorMessage) {
        super(errorMessage);
    }
}