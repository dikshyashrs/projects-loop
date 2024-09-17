
/* This program quizes users on planet facts
written by Dikshya Shrestha
02.11.24
JDK ver 21.0.2 */

import java.util.Scanner;
public class PlanetFacts {

    public static void main(String[] args) {
        
        String choice;
        String again;
    do {
        Scanner input = new Scanner (System.in); 
        int randNum = (int) (Math.random () *10 + 1);
        
        boolean ans = switchPlanet (randNum); //calling switchPlanet method, storing answer in boolean variable
              
        System.out.print("Is this fact true or false? ");
        choice = input.nextLine(); 
        
        compare (choice, ans); //calling compare method
        
            System.out.print("play again? (yes or no) ");
            again = input.nextLine();
        } while (again.equalsIgnoreCase("Yes")); //loop runs as long as user inputs yes
    }
    
    public static boolean switchPlanet (int num) {
       String fact = "invalid";
       boolean answer = false;
       switch (num) {
           
           case 1: 
               fact = "Venus is the hottest planet in the solar system.";
               answer = true;
               break;
           case 2:
               fact = "Earth has more moons than any other planet in the solar system";
               answer = false;
               break;
           case 3:
               fact = "Jupiter is the largest planet in the solar system.";
               answer = true;
               break;
           case 4:
               fact = "Saturn is the heaviest planet in the solar system.";
               answer = false;
               break;
           case 5:
               fact = "Venus is the brightest planet in the solar system";
               answer = true;
               break;
           case 6:
               fact = "Earth has more exposed land than water.";
               answer= false;
               break;
           case 7:
               fact = "Saturn is the second biggest planet in the solar system.";
               answer = true;
               break;
           case 8:
               fact = "Mars is often dubbed the 'Blue Planet'";
               answer = false;
               break;
           case 9:
               fact = "Uranus is the second farthest planet from the sun.";
               answer = true;
               break;
           case 10:
               fact = "Venus is the closest planet to the sun.";
               answer = false;
               break;
       }
        System.out.println(fact);
        return answer;
    }
    
    public static void compare (String opt, boolean wer){      
        if ( wer == true) {
            if (opt.equalsIgnoreCase ("TRUE")) 
                System.out.println("That is correct!");
            
            else if (opt.equalsIgnoreCase("FALSE")) 
                System.out.println("That is incorrect.");
            
            else 
                System.out.println("invalid answer");
        }
        else {
            if (opt.equalsIgnoreCase("TRUE")) 
                System.out.println("That is incorrect.");
            
            else if (opt.equalsIgnoreCase ("FALSE"))
                System.out.println("That is correct!");
            
            else
                System.out.println("Invalid answer");
        }
       
    }
}
