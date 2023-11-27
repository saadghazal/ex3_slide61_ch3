import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);// creating console object to gt user input
        PrintWriter outFile = new PrintWriter("out_file.txt"); // creating output file
        System.out.println("Enter Numbers (enter a negative value to stop):");
        while (true){

            System.out.println("Enter a number: ");
            int value = console.nextInt();// user enters number
            if(value < 0){
                // the user entered negative value stop reading user input
                System.out.println("Negative value entered stop reading");
                break;
            }else {
                // the user entered 0 or positive value add the value to the output file
                outFile.println(value);
            }
        }

        // close output file for saving changes
        outFile.close();

    }
}