package com.junit.java;

import org.junit.Test;

import junit.framework.Assert;

public class userRegistrationTest {

	userRegistration userRegistration = new userRegistration();

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.firstName("Nadeem");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenFirstName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.firstName("nadeem");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.lastName("Akhtar");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.lastName("akhtar");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.email("nadeem@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.email("nadeem&.com");
		Assert.assertEquals(false, result);

	}

	@Test
	public void givenPhoneNumber_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.mobileNumber("918826923224");
		Assert.assertEquals(true, result);

	}

	@Test
	public void givenPhoneNumber_WhenNotProper_SholdReturnFalse() {
		boolean result = userRegistration.mobileNumber("64587541236");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password("Asdfghjk");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPassword_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password("asdfghjk");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule2_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password2("Asdfgh55");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenPasswordRule2_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password2("asdfghjk");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPasswordRule3_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password3("asdfghjk");
		Assert.assertEquals(true, result);

	}

	@Test
	public void givenPasswordRule3_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password3("asdfghjkpppp");
		Assert.assertEquals(false, result);

	}

	@Test
	public void givenPasswordRule4_WhenProper_ShouldReturnTrue() {
		boolean result = userRegistration.password4("Asdfgh@55");
		Assert.assertEquals(true, result);

	}

	@Test
	public void givenPasswordRule4_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.password4("Asdfgh55");
		Assert.assertEquals(false, result);

	}

	@Test
	public void givenEmail8_WhenNotProper_ShouldReturnTrue() {
		boolean result = userRegistration.emailIdValidator("abc.xyz@bl.co.in");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmail9_WhenNotProper_ShouldReturnFalse() {
		boolean result = userRegistration.emailIdValidator("abc..2002@gmail.com");
		Assert.assertEquals(false, result);

	}

}
