package org.password.verify;

public class PasswordLength implements Rule{
    @Override
    public boolean isSatisfiedOn(String s) {
        return isLengthGreaterThan8(s);
    }

    public boolean isLengthGreaterThan8(String s){
        if(s.length()>8)
            return true;
        return false;
    }
}
