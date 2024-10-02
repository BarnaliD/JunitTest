package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up test conditions...");
        // You can initialize or set up shared objects here before each test
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Cleaning up after test...");
        // You can clean up resources or reset conditions here after each test
    }

    @Test

    public void testIsPhoneNumberValid() {
        //Valid Phone numbers
        assertTrue(Validator.isPhoneNumberValid("0789234"), "Valid phone number (7 digits)");
        assertTrue(Validator.isPhoneNumberValid("0901234567"), "Valid phone number (10 digits)");


        // Invalid phone numbers
        assertFalse(Validator.isPhoneNumberValid("189234"), "Invalid phone number: Does not start with 0");
        assertFalse(Validator.isPhoneNumberValid("07892"), "Invalid phone number: Less than 6 digits");
        assertFalse(Validator.isPhoneNumberValid("07892abcdef"), "Invalid phone number: Contains non-numeric characters");
        assertFalse(Validator.isPhoneNumberValid("09123456789"), "Invalid phone number: More than 10 digits");
        assertFalse(Validator.isPhoneNumberValid(""), "Invalid phone number: Empty string");
    }
    @Test
    public void testInvalidPhoneNumberTooShort() {
        assertFalse(Validator.isPhoneNumberValid("0123"), "Phone number with fewer than 6 digits should be invalid");
    }

    @Test
    public void testInvalidPhoneNumberTooLong() {
        assertFalse(Validator.isPhoneNumberValid("01234567890"), "Phone number with more than 10 digits should be invalid");
    }
    @Test
    public void testInvalidPhoneNumberWithLetters() {
        assertFalse(Validator.isPhoneNumberValid("01234abc"), "Phone number with non-numeric characters should be invalid");
    }

    @Test

    public void testIsEmailValid() {
        // Valid emails
        assertTrue(Validator.isEmailValid("john@gmail.com"), "Valid email");
        assertTrue(Validator.isEmailValid("alice.jones@domain.co.uk"), "Valid email with subdomain");

        // Invalid emails
        assertFalse(Validator.isEmailValid("john@gmailcom"), "Invalid email: Missing top-level domain dot");
        assertFalse(Validator.isEmailValid("@gmail.com"), "Invalid email: Missing local part");
        assertFalse(Validator.isEmailValid("john@.com"), "Invalid email: Missing domain name");
        assertFalse(Validator.isEmailValid("john@gmail."), "Invalid email: Missing top-level domain");
        assertFalse(Validator.isEmailValid("john@domaincom"), "Invalid email: Missing top-level domain dot");
        assertFalse(Validator.isEmailValid(""), "Invalid email: Empty string");
    }




}