package org.password.verify.exceptions;

public class PasswordValidationException extends Exception {
    public PasswordValidationException(String errorMessage) {
        super(errorMessage);
    }
}
