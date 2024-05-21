//code for creating a program for shutting down pc according to user input

import java.io.IOException;
import java.util.Scanner;

public class CodesCracker {
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in); //declaring the scanner

        System.out.println("Enter the Number of seconds: ");
        int seconds = Scan.nextInt();  //taking the input for seconds inputs

        Runtime run = Runtime.getRuntime();

        try{
            System.out.println("shutting down the pc after " + seconds + "seconds");
            run.exec("shutdown -s -t " + seconds);

        }
        catch(IOException e){
            System.out.println("Exception "+ e);

        }


    }

}
