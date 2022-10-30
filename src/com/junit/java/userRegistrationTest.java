package com.junit.java;

import org.junit.Test;

import junit.framework.Assert;

public class userRegistrationTest {

	userRegistration userRegistration = new userRegistration();
	 

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        boolean result = userRegistration.firstName("Shadab");
        Assert.assertEquals(true, result);
    }
    @Test
	    public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.firstName("shadab");
        Assert.assertEquals(false, result);
	}

}
