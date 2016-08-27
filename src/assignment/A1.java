package assignment;

import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        
        System.out.println("Hal : How many laws of predictions are there according to Arthur C. Clarke ?");
        
        String phrase = scan.nextLine();
        int correctNumber = 3;
        
        
        if(phrase.toLowerCase().equals("three")){
        	System.out.println("There are indeed " + phrase+" laws of predition");
        }else{
        	
        		if(Integer.parseInt(phrase)==correctNumber){
        			System.out.println("There are indeed " + phrase+" laws of predition");
        		}
        		else{
        			System.out.println("No, there are " + correctNumber +" laws of predition");
        		}
        	
        
        }
	}

}
