package Counter;

//Import Scanner and InputMismatchException Classes
import java.util.Scanner;
import java.util.InputMismatchException;

public class Counter {
    public static void main(String[] args) {

        // Declare & create an instance of the Scanner class
        Scanner input = new Scanner(System.in);

        //Declare and initialize variables
        int userNumber = 0;
        int userNumberLength = 0;
        boolean check = true;


        // Request input from user
        System.out.println("This program counts the number of digits in an integer entered by the user.");
        System.out.println("Enter -1 to exit");

        //Out do-while loop to read input from user until -1 input
        do{
            try{
                System.out.print("Entered Number:");
                // Read in integer value and assign to variable
                userNumber = input.nextInt();
                //If input not -1 run try-catch block else exit program
                if(userNumber!=-1) {
                    //Calculate length of user number
                    userNumberLength = String.valueOf(userNumber).length();
                    //Output result
                    System.out.printf("Number of digits in %d is %d%n", userNumber, userNumberLength);
                } else {
                    //When input -1, set check = false to exit program
                    check = false;
                }
            }catch(InputMismatchException ime){
                //If user input something other than an integer, throw error and print error message
                System.out.println("Error: " + ime);
                //Scan next line for user input
                input.nextLine();
            }
        }while(check);

        //Close input object
        input.close();
        //Print Program Terminated and exit program
        System.out.println("Program Terminated");

    }
}