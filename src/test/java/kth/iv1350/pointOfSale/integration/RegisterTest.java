package kth.iv1350.pointOfSale.integration;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {

    @Test
    void testGetBalance() {
        Register register = new Register(100.0);
        System.out.println("Running testGetBalance for register: "+ register);
        assertEquals(100.0, register.getBalance(), "Initial balance should be 100.0");
    }

    @Test
    void testAddAmount() {
        Register register = new Register(100.0);
        register.addAmount(50.0);
        assertEquals(150.0, register.getBalance(), "Balance should be 150.0 after adding 50.0");
    }

    @Test
    void testSubtractAmount() {
        Register register = new Register(100.0);
        register.subtractAmount(30.0);
        assertEquals(70.0, register.getBalance(), "Balance should be 70.0 after subtracting 30.0");
    }

    @Test
    void testSubtractAmountExceedingBalance() {
        Register register = new Register(100.0);
        register.subtractAmount(150.0);
        assertEquals(100.0, register.getBalance(), "Balance should remain 100.0 when subtracting more than available balance");
    }

    @Test
    void testAddNegativeAmount() {
        Register register = new Register(100.0);
        register.addAmount(-50.0);
        assertEquals(100.0, register.getBalance(), "Balance should remain 100.0 when adding a negative amount");
    }
}