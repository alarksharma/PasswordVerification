package org.password.verify;

import org.junit.Test;
import org.password.verify.exceptions.PasswordValidationException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {
    @Test
    public void validateCorrectPassword(){
        assertTrue(new PasswordValidator().validate("123456789aA"));
    }
    @Test
    public void validateIncorrectPassword(){
        assertFalse(new PasswordValidator().validate("12"));
    }
    @Test
    public void validateAny3Condition_true() throws PasswordValidationException {
        assertTrue(new PasswordValidator().validateAny3("1234aA"));
    }
    @Test(expected = PasswordValidationException.class)
    public void validateAny3Condition_false() throws PasswordValidationException {
        assertTrue(new PasswordValidator().validateAny3("12"));
    }

    @Test
    public void validateAny3andLowercaseCondition_true() throws PasswordValidationException {
        assertTrue(new PasswordValidator().validateAny3AndLowercase("123456789a"));
    }
    @Test(expected = PasswordValidationException.class)
    public void validateAny3andLowercaseCondition_false() throws PasswordValidationException {
        assertTrue(new PasswordValidator().validateAny3AndLowercase("123456789A"));
    }
}
