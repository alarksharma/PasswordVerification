package org.password.verify;

import org.password.verify.exceptions.PasswordNumberException;

public class PasswordNumberRule implements Rule{
    @Override
    public boolean isSatisfiedOn(String s) throws PasswordNumberException {
        return haveNumber(s);
    }

    public boolean haveNumber(String s) throws PasswordNumberException {
        if(!s.matches(".*[0-9].*"))
            throw new PasswordNumberException("Password should have one Number at least");
        return true;
    }
}
