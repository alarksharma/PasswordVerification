package org.password.verify;

import org.password.verify.exceptions.PasswordNullException;

public class PasswordNotNull implements Rule{
    @Override
    public boolean isSatisfiedOn(String s) throws PasswordNullException {
        return isPasswordNotNull(s);
    }

    public boolean isPasswordNotNull(String s) throws PasswordNullException {
        if(s==null)
            throw new PasswordNullException("Password should not be Null");
        return true;
    }
}
