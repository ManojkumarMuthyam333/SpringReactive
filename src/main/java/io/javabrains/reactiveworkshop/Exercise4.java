package io.javabrains.reactiveworkshop;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        // TODO: Write code here
    	
    	ReactiveSources.intNumberMono().subscribe(number->System.out.println("Mono is " + number));

        // Get the value from the Mono into an integer variable
        // TODO: Write code here

        System.out.println("Press a key to end");
        System.in.read();
    }

}
