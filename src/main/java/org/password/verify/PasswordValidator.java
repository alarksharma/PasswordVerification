package org.password.verify;

import org.password.verify.exceptions.PasswordValidationException;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class PasswordValidator {
    private static final List<Rule> rules = asList(
            new PasswordNumberRule(),
            new PasswordNotNullRule(),
            new PasswordUppercaseRule(),
            new PasswordLowercaseRule(),
            new PasswordLengthRule());

    public boolean validate(String password) {
        return rules.parallelStream().allMatch(rule -> {
            try {
                return rule.isSatisfiedOn(password);
            } catch (PasswordValidationException e) {
            }
            return false;
        });
    }

    public boolean validateAny3(String password) throws PasswordValidationException {
        List<Boolean> result=new ArrayList<Boolean>();
         rules.parallelStream().forEach(rule -> {
            try {
                 result.add(rule.isSatisfiedOn(password));
            } catch (PasswordValidationException e) {
            }
        });
        int count=0;
        for (boolean b:result) {
            if(b)
                count++;
        }
        if(count>=3)
            return true;
        throw new PasswordValidationException("More Than 3 conditions should be true");
    }

    public boolean validateAny3AndLowercase(String password) throws PasswordValidationException {
        return validateAny3(password) && new PasswordLowercaseRule().isSatisfiedOn(password);
    }

}


