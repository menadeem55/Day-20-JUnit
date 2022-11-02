package com.junit.java;

import org.junit.Assert;
import org.junit.Test;

public class userRegistrationTest {

	 @Test
	    public void givenFirstName_whenProper_ShouldReturnTrue() {
	        userRegistration userRegistrationRegEx = new userRegistration();
	        boolean result = userRegistrationRegEx.firstNameValidate("Shadab");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
	        userRegistration userRegistrationRegEx = new userRegistration();
	        boolean result = userRegistrationRegEx.firstNameValidate("Shadab");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenLastName_whenProper_ShouldReturnTrue() {
	        userRegistration userRegistrationRegEx = new userRegistration();
	        boolean result = userRegistrationRegEx.lastNameValidate("Hussain");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenLastName_whenNotProper_ShouldReturnFalse() {
	        userRegistration userRegistrationRegEx = new userRegistration();
	        boolean result = userRegistrationRegEx.lastNameValidate("hussain");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenEmail_whenProper_ShouldReturnTrue() {
	        userRegistration userRegistrationRegEx = new userRegistration();
	        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenEmail_whenNotProper_ShouldReturnFalse() {
	        userRegistration userRegistrationRegEx = new userRegistration();
	        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenPhone_whenProper_ShouldReturnTrue() {
	        userRegistration userRegistrationRegEx = new userRegistration();
	        boolean result = userRegistrationRegEx.phoneNumberValidate("91 7879219494");
	        Assert.assertTrue(result);
	    }

	    @Test
	    public void givenPhone_whenNotProper_ShouldReturnFalse() {
	        userRegistration userRegistrationRegEx = new userRegistration();
	        boolean result = userRegistrationRegEx.phoneNumberValidate("7879219494");
	        Assert.assertFalse(result);
	    }

	    @Test
	    public void givenPassword_whenProper_ShouldReturnTrue() {
	        userRegistration userRegistrationRegEx = new userRegistration();
	        boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
	        Assert.assertTrue(result);
	    }
	    

	    @Test
	    public void givenPassword_whenNotProper_ShouldReturnFalse() {
	        userRegistration userRegistrationRegEx = new userRegistration();
	        boolean result = userRegistrationRegEx.passwordValidate("Shadab23#%");
	        Assert.assertFalse(result);
	    }
	}