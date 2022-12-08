package org.password.verify;

import org.junit.Test;
import org.password.verify.exceptions.PasswordUppercaseException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordUppercaseRuleTest {
    @Test
    public void testPasswordHaveUppercase() throws PasswordUppercaseException {
            assertTrue(new PasswordUppercaseRule().isSatisfiedOn("abcD"));
    }

    @Test(expected = PasswordUppercaseException.class)
    public void testPasswordNotHaveUppercase() throws PasswordUppercaseException {
            assertFalse(new PasswordUppercaseRule().isSatisfiedOn("abcd"));

    }
}
