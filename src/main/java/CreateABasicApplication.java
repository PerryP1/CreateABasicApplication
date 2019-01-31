import java.util.Random;
import java.util.Scanner;

public class CreateABasicApplication {
    //This allows you to interact with console system outputs
    public static void main(String[] args) {
        //Declaring instances of scanner classes
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter number that computer will add 5 to it, double it, subtract 7 from it");
        int number;
        //This is how you get the user to enter a number
        System.out.println("Enter number");
        number = myScanner.nextInt();

//This is what should happen mathematically

        //This is how to make the math happen
        int num = number;

        // num +=  5 :num = num + 5)
        num += 5;
        num *= 2;
        num -= 7;

        //This is showing what math happened
        System.out.println(num);

    }
}

// Your 6 year old client needs an application that will receive an integer from the user banging on the keyboard, add 5 to it, double it, subtract 7 from it, and display the result to the screen.
//*