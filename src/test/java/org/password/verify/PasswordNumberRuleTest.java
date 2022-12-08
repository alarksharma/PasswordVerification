package org.password.verify;

import org.junit.Test;
import org.password.verify.exceptions.PasswordNumberException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordNumberRuleTest {
    @Test
    public void testPasswordHaveNumber() throws PasswordNumberException {
            assertTrue(new PasswordNumberRule().isSatisfiedOn("abc9D"));
    }

    @Test(expected = PasswordNumberException.class)
    public void testPasswordNotHaveNumber() throws PasswordNumberException {
            assertFalse(new PasswordNumberRule().isSatisfiedOn("aABCD"));

    }
}
