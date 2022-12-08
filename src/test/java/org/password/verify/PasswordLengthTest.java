package org.password.verify;

import org.junit.Test;
import org.password.verify.exceptions.PasswordLengthException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordLengthTest {
    @Test
    public void testLengthGreaterThan8() {
        try {
            assertTrue(new PasswordLength().isSatisfiedOn("123456789"));
        } catch (PasswordLengthException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(expected = PasswordLengthException.class)
    public void testLengthLessThan8() throws PasswordLengthException {
            assertFalse(new PasswordLength().isSatisfiedOn("12"));

    }
}
