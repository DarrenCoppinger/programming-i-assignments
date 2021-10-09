package Question1;
//Import Scanner and InputMismatchException Classes

import java.util.Scanner;
import java.util.InputMismatchException;

public class Question1 {
    public static void main(String[] args) {
        // Declare & create an instance of the Scanner class
        Scanner input = new Scanner(System.in);

        //Declare and initialize variables
        int userChoice = 0;
        int userTemp = 0;
        double convertedTemp = 0;
        boolean check = true;
        boolean innerCheck = true;

        // Request input from user
        System.out.println("This program has two modes:");
        System.out.println("Mode 1: Converts Fahrenheit to Celsius");
        System.out.println("Mode 2: converts Celsius to Fahrenheit");
        System.out.println("");

        System.out.println("Enter '1' to choose mode 1 or '2' to choose mode 2.");
        System.out.println("Enter -1 to exit the program.");
        System.out.println("");

        do{
            try{
                System.out.print("Choose mode: ");
                // Read in integer value and assign to variable
                userChoice = input.nextInt();
                //If input not -1 run try-catch block else exit program

                if(userChoice!=-1) {
                    //Choose mode
                    do{
                        if(userChoice == 1){
                            System.out.println("Starting Mode 1: Converts Fahrenheit to Celsius");
                            do{
                                try{
                                    System.out.print("Enter Fahrenheit value: ");
                                    // Read in integer value and assign to variable
                                    userTemp = input.nextInt();
                                    System.out.println("Fahrenheit value: "+ userTemp + "F");
                                    convertedTemp = ((5.0/9.0)*(userTemp-32));
                                    System.out.printf("Converted Celsius value: %.2f C", convertedTemp);
                                    System.out.println("");
                                    innerCheck = false;
                                }catch(InputMismatchException ime){
                                    //If user input something other than an integer, throw error and print error message
                                    System.out.println("Error: " + ime);
                                    System.out.println("Please enter an integer value for temperature: ");
                                    //Scan next line for user input
                                    input.nextLine();
                                }
                            }while(innerCheck);

                        }else if(userChoice == 2){
                            System.out.println("Starting Mode 2: Converts Celsius to Fahrenheit");
                            do{
                                try{
                                    System.out.print("Enter Celsius value: ");
                                    // Read in integer value and assign to variable
                                    userTemp = input.nextInt();
                                    System.out.println("Celsius value: "+ userTemp + "C");
                                    convertedTemp = (((9.0/5.0)*userTemp)+32);
                                    //System.out.println("Converted Fahrenheit value: "+ convertedTemp + "F");
                                    System.out.printf("Converted Fahrenheit value: %.2f F", convertedTemp);
                                    System.out.println("");
                                    innerCheck = false;
                                }catch(InputMismatchException ime){
                                    //If user input something other than an integer, throw error and print error message
                                    System.out.println("Error: " + ime);
                                    System.out.println("Please enter an integer value for Celsius temperature: ");
                                    //Scan next line for user input
                                    input.nextLine();
                                }
                            }while(innerCheck);
                        }else{
                            //If user in an integer that is not 1 or 2
                            System.out.println("Incorrect input. Please choose either 1 or 2:");
                            userChoice = input.nextInt();
                        }
                    }while(innerCheck);

                } else {
                    //When input -1, set check = false to exit program
                    check = false;
                }
                check = false;
            }catch(InputMismatchException ime){
                //If user input something other than an integer, throw error and print error message
                System.out.println("Error: " + ime);
                System.out.println("Please enter '1' to choose mode 1 or '2' to choose mode 2.");
                System.out.println("Or enter -1 to exit the program.");
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

