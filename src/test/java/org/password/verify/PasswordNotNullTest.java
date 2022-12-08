package org.password.verify;

import org.junit.Test;
import org.password.verify.exceptions.PasswordNullException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordNotNullTest {
    @Test
    public void testPasswordNotNull() throws PasswordNullException {
            assertTrue(new PasswordNotNull().isSatisfiedOn("a"));
    }

    @Test(expected = PasswordNullException.class)
    public void testPasswordNull() throws PasswordNullException {
        assertFalse(new PasswordNotNull().isSatisfiedOn(null));

    }
}
