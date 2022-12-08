package org.password.verify;

import org.password.verify.exceptions.PasswordValidationException;

public interface Rule {
    boolean isSatisfiedOn(String s) throws PasswordValidationException;
}
