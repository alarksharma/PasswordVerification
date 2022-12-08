package org.password.verify;

import org.password.verify.exceptions.PasswordValidationException;

import java.util.List;

import static java.util.Arrays.asList;

public class PasswordValidator {
    private static final List<Rule> rules = asList(
            new PasswordLowercaseRule(),
            new PasswordNumberRule(),
            new PasswordUppercaseRule(),
            new PasswordNotNullRule(),
            new PasswordLengthRule());

    public boolean validate(String password) {
        return rules.stream().allMatch(rule -> {
            try {
                return rule.isSatisfiedOn(password);
            } catch (PasswordValidationException e) {
                throw new RuntimeException(e);
            }
        });
    }
}


