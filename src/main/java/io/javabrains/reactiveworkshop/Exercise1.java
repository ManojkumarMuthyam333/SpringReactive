package io.javabrains.reactiveworkshop;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exercise1 {

    private static Stream<String> map;
	private static Stream<String> stream;

	public static void main(String[] args) {
    	
    	
    	
    	
    	List<Integer> Numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    	for(Integer i:Numbers)
    	{
    		System.out.println(i);
    	}
    	
    	//this we can change by using the streams as below
    	
    	Numbers.stream().forEach(number->System.out.println(number));

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
    	
    	StreamSources.intNumbersStream().forEach(number->System.out.println(number));
    	StreamSources.intNumbersStream().forEach(System.out::println);
    	StreamSources.stringNumbersStream().forEach(s->System.out.println(s));
    	

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
    	StreamSources.intNumbersStream().filter(number -> number<5).forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
    	StreamSources.intNumbersStream().filter(number -> number<5)
    	.skip(1)
    	.limit(2)
    	.forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
    	
    	Integer value=StreamSources.intNumbersStream().filter(number -> number>5).
    	findFirst()
    	.orElse(-1);
    	System.out.println(value);

        // Print first names of all users in userStream
        // TODO: Write code here
    	
    	StreamSources.userStream().forEach(user->System.out.println(user.getFirstName()));
    	//Same with map
    	 StreamSources.userStream().map(user->user.getFirstName()).
    	 forEach(userName->System.out.println(userName));
    	 
    	 
        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here

    	 StreamSources.intNumbersStream()
    	 .flatMap(id->StreamSources.userStream().filter(user->user.getId()==id))
    	 .map(user->user.getFirstName())
    	 .forEach(user->System.out.println(user));
    	 
    	 StreamSources.intNumbersStream()
    	 .flatMap(id->StreamSources.userStream().filter(user->user.getId()==id)).map(user-> user.getLastName()).forEach(System.out::println);
    	 
    }

}
