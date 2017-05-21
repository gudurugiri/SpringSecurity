/**
 * 
 */
package com.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author BUJAIR
 *
 */
public class DecodeTest {
	
	public static void main(String...strings ) {
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		System.out.println(encoder.encode("test"));
	}
}
