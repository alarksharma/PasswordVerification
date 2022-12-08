package org.password.verify.exceptions;

public class PasswordUppercaseException extends PasswordValidationException{
    public PasswordUppercaseException(String errorMessage) {
        super(errorMessage);
    }
}
