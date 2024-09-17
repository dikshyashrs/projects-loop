/* this program records the sale of sodas and determines the lowest and highest 
selling soda.
* Written by Dikshya Shrestha
* 03.02.2024
* JDK ver 21.0.2
*/

import java.util.Scanner;
public class SodaSales {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int numSoda;
        
        do {
        System.out.print("How many types of soda would you like to sell? ");
        numSoda = input.nextInt();
        } while (numSoda < 0); // loop runs if the input is negative number
        
        String[] sodaName = new String [numSoda];
        input.nextLine(); // to consume newline character
        
        for (int i = 0; i < numSoda; i++){
            System.out.print("Enter name of soda type"+ (i+1) +": ");
            sodaName[i] = input.nextLine();
        }
        
        int[] bottlesSold = new int[numSoda];
        
        for (int a = 0; a < numSoda; a++) {
          do{
            System.out.print("Enter number of bottles sold for "+ sodaName[a]
                        + ": ");
            bottlesSold[a] = input.nextInt();
          } while (bottlesSold[a] < 0); //loop runs if input is negative number
        }
         
        int totalSale = 0;
        for (int total: bottlesSold) {
            totalSale += total;
        } // this finds the number of total sales
        
        int highestIndex = 0;
        int lowestIndex = 0;
        for (int b = 1; b < numSoda; b++ ){
            if (bottlesSold[b] > bottlesSold[highestIndex]){
                highestIndex = b;
            }
            if (bottlesSold[b] < bottlesSold[lowestIndex]){
                lowestIndex = b;
            }//to find which soda was sold the most and least
        }
        System.out.println("Total soda sold: " + totalSale);
        System.out.println("Highest number of soda sold: "+ sodaName[highestIndex]);
        System.out.println("Lowest number of soda sold: "+ sodaName[lowestIndex]);
    }   
}
