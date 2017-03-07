package com.codesamples;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

public class FirstNonRepeatedCharTest {


	@Test
	public void testFirstNonRepeatedChar() {
		
		Character c = new Character('i');
		assertEquals(c, FirstNonRepeatedChar.nonRepeatedChar("airplane"));
		
		
		//Optional<Character> oc = 'i';
		//assertEquals(c, FirstNonRepeatedChar.findFirstNonRepeatingLetterJava8New("airplane"));
		
		
		c = new Character('m');
		assertEquals(c, FirstNonRepeatedChar.nonRepeatedChar("llama"));
		
		
	}
		
	
	@Test
	public void testFirstNonRepeatedCharWithRepeatedChars() {
		assertNull(FirstNonRepeatedChar.nonRepeatedChar("toot"));
	}
	
	@Test
	public void testFirstNonRepeatedCharWithEmptyString() {
		 assertNull(FirstNonRepeatedChar.nonRepeatedChar(""));
	}
	
	@Test
	public void testFirstNonRepeatedCharWithNull() {
		String s = null;
		assertNull(FirstNonRepeatedChar.nonRepeatedChar(s));
	}
	
}
