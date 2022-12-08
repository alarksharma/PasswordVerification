package org.password.verify.exceptions;

public class PasswordLowercaseException extends PasswordValidationException{
    public PasswordLowercaseException(String errorMessage) {
        super(errorMessage);
    }
}
