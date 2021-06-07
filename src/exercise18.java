/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tom Adoni
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner kb= new Scanner(System.in);
	    String temp="";
	    String choice="";
	    System.out.println("Press C to convert from Fahrenheit to Celsius.\n"+"Press F to convert from Celsius to Fahrenheit.");
	    temp= kb.nextLine();
	    if(temp.equals("C")||temp.equals("c")){
	        choice="C";
        }
	    else{
	        choice="F";
        }
	    System.out.println("Your choice: "+choice);
	    int t=0;
	    if(choice.equals("C")) {
            System.out.println("Please enter the temperature in Fahrenheit: ");
            t=kb.nextInt();
            System.out.println("The temperature in Celsius is "+(t-32)*5/9);
        }
	    else{
            System.out.println("Please enter the temperature in Celsius: ");
            t=kb.nextInt();
            System.out.println("The temperature in Fahrenheit is "+((t*9/5)+32));
        }
    }
}
