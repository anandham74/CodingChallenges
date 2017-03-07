package com.codesamples;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedChar {
	
	public static Character nonRepeatedChar(String str) {
		LinkedHashMap<Character,Integer> nonRepMap= new LinkedHashMap<>();

		if(null != str) {

			for(int i=0;i<str.length();i++){

				if(nonRepMap.containsKey(str.charAt(i))){
					nonRepMap.put(str.charAt(i), nonRepMap.get(str.charAt(i))+1);
				}
				else {
					nonRepMap.put(str.charAt(i), 1);
				}
			}

			for(Entry<Character,Integer> entry: nonRepMap.entrySet()){

				if(entry.getValue() == 1){
					return entry.getKey();

				}

			}
		}

		return null;
	}

	    
	    private static void findFirstNonRepeatingLetterJava8(String s, Consumer<Character> callback) {
	        s.chars()
	          .mapToObj(i -> Character.valueOf((char) i))
	          .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
	          .entrySet().stream()
	          .filter(entry -> entry.getValue() == 1L)
	          .map(entry -> entry.getKey())
	          .findFirst().map(c -> { callback.accept(c); return c; } );
	      }

	    public static Optional<Character> findFirstNonRepeatingLetterJava8New(String s) {
	        return (Optional<Character>)s.chars()
	          .mapToObj(i -> Character.valueOf((char) i))
	          .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
	          .entrySet().stream()
	          .filter(entry -> entry.getValue() == 1L)
	          .map(entry -> entry.getKey())
	          .findFirst().map(ch -> ch);
	      }
	    
	    
}
