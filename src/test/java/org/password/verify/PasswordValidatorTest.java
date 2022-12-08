package org.password.verify;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PasswordValidatorTest {
    @Test
    public void test(){
        assertTrue(new PasswordValidator().validate("123456789aA"));
    }
}
