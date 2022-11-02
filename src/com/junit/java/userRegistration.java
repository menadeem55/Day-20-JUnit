package com.junit.java;

import java.util.regex.Pattern;

public class userRegistration {



    public boolean validateEmail(String email)
    {
    	
        return Pattern.matches("^[\\w+_-]+(?:\\.[\\w+_-]+)*[@][\\w]{1,}([.]{1}[a-z]{2,}){1,2}$", email);
    }
}