/* 
This program will generate a math quiz and tally the number of correct and
incorrect answers.
Written by Dikshya Shrestha
02.04.2024
JDK version 21.0.2
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class MathQuiz {
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
   
        int numEquations; 
        int correctCounter;
        int incorrectCounter;
        double ave;
        do { //loop runs as long as the number input by user is greater than 0
            System.out.print("How many equations would you like to solve? ");  
            numEquations = input.nextInt(); //allows user to input number of euqations to solve   
           
         if (numEquations > 0) {           
          do{  
             correctCounter = 0; //counters initialized to 0 so they dont keep counting if fail quiz
             incorrectCounter = 0;
            for (int x = 1; x <= numEquations; x++)
                {                  
            int num1 = (int) (Math.random()* 50 +1); /*generates random number 
                                                    between 1-50*/ 
            int num2 = (int)(Math.random() * 50 + 1);
            System.out.print(num1 +" + "+ num2+ " = ? ");
            int ans = input.nextInt();
            int equation = num1 + num2;
            
                 if (ans == equation)
                 {
                     System.out.println ("Correct!");
                     correctCounter++;                   
                 } else 
                 {
                     System.out.println("Incorrect");
                     incorrectCounter++;
                 }         
                }
            ave = ((double)correctCounter / numEquations) * 100;
            DecimalFormat i = new DecimalFormat ("0.00"); //formating the value of percent to be 2 decimals
            
            System.out.println("You correctly answered "+correctCounter+" out of "
                            +numEquations + " questions. That is "+i.format(ave)
                            +"%");
            
            if (ave >= 70) 
                {
                System.out.println("You have passed, Congratulations!");               
                }
            else 
                {
                System.out.println("You did not pass, please try again");
                }
            } while (ave < 70); //loop will run again if fail quiz                     
            }    
    } while (numEquations < 0);
}
}

