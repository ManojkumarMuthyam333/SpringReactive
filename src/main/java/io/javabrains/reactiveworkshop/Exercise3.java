package io.javabrains.reactiveworkshop;

import java.io.IOException;
import java.util.List;

public class Exercise3 {

    private static List<Integer> list;
	private static List<Integer> list2;

	public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        // TODO: Write code here

    	list2 = ReactiveSources.intNumbersFlux().toStream().toList();
    	
    	System.out.println("items in the list is " + list2);
    	
    	System.out.println("size is "+ list2.size());

        System.out.println("Press a key to end");
        System.in.read();
    }

}
