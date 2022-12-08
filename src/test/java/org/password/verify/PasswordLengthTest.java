package org.password.verify;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PasswordLengthTest {
    @Test
    public void test() {
        assertTrue(new PasswordLength().isSatisfiedOn("123456789"));
        assertFalse(new PasswordLength().isSatisfiedOn("12"));
    }
}
