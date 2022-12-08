package org.password.verify;

import org.junit.Test;
import org.password.verify.exceptions.PasswordLowercaseException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordLowercaseRuleTest {
    @Test
    public void testPasswordHaveLowercase() throws PasswordLowercaseException {
            assertTrue(new PasswordLowercaseRule().isSatisfiedOn("abcD"));
    }

    @Test(expected = PasswordLowercaseException.class)
    public void testPasswordNotHaveLowercase() throws PasswordLowercaseException {
            assertFalse(new PasswordLowercaseRule().isSatisfiedOn("ABCD"));

    }
}
