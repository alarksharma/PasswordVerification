package org.password.verify;

import org.password.verify.exceptions.PasswordLowercaseException;

public class PasswordLowercaseRule implements Rule{
    @Override
    public boolean isSatisfiedOn(String s) throws PasswordLowercaseException {
        return haveLowerCase(s);
    }

    public boolean haveLowerCase(String s) throws PasswordLowercaseException {
        if(s.toUpperCase().equals(s))
            throw new PasswordLowercaseException("password should have one Lowercase letter at least");
        return true;
    }
}
