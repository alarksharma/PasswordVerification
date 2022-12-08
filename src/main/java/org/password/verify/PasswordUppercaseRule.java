package org.password.verify;

import org.password.verify.exceptions.PasswordUppercaseException;

public class PasswordUppercaseRule implements Rule{
    @Override
    public boolean isSatisfiedOn(String s) throws PasswordUppercaseException {
        return haveUpperCase(s);
    }

    public boolean haveUpperCase(String s) throws PasswordUppercaseException {
        if(s.toLowerCase().equals(s))
            throw new PasswordUppercaseException("password should have one uppercase letter at least");
        return true;
    }
}
