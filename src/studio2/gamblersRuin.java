package studio2;

import java.util.Scanner;

public class gamblersRuin {

	public static void main(String[] args) {
		
Scanner in = new Scanner(System.in);

        
        System.out.print("Enter a starting amount: ");
        double startAmount = in.nextDouble();
        
        System.out.print("Enter a win limit: "); 
        int winLimit = in.nextInt();
        
        System.out.print("Enter a win chance: ");
        int winChance = in.nextInt();
        
        
        double probability = (double) (Math.random()); 
        
        while (startAmount > 0 || startAmount < winLimit) {
        	if (probability <= winChance) {
        	startAmount = startAmount + 1;  }
        	else {
        		startAmount = startAmount - 1; 
        	}
       /* 	if (startAmount = winLimit) { 
        		System.out.print("Success")
        	if (startAmount = 0) {
        			System.out.print("Ruin"); */
        			
       
        		}
        	}
        	
     
        
        
      
        		
        
	}



