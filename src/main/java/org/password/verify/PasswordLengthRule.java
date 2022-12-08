package org.password.verify;

import org.password.verify.exceptions.PasswordLengthException;

public class PasswordLengthRule implements Rule{
    @Override
    public boolean isSatisfiedOn(String s) throws PasswordLengthException {
        return isLengthGreaterThan8(s);
    }

    public boolean isLengthGreaterThan8(String s) throws PasswordLengthException {
        if(s.length()<8)
            throw new PasswordLengthException("password should be larger than 8 chars");
        return true;
    }
}
