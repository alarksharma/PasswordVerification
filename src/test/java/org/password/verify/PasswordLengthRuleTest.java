package org.password.verify;

import org.junit.Test;
import org.password.verify.exceptions.PasswordLengthException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordLengthRuleTest {
    @Test
    public void testLengthGreaterThan8() throws PasswordLengthException {
            assertTrue(new PasswordLengthRule().isSatisfiedOn("123456789"));
    }

    @Test(expected = PasswordLengthException.class)
    public void testLengthLessThan8() throws PasswordLengthException {
            assertFalse(new PasswordLengthRule().isSatisfiedOn("12"));

    }
}
