package org.password.verify.exceptions;

public class PasswordLengthException extends PasswordValidationException{
    public PasswordLengthException(String errorMessage) {
        super(errorMessage);
    }
}
