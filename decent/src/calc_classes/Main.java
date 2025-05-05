package calc_classes;


import java.util.Scanner;
        //we are importing the Scanner from the util folder

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //parameters basically say "this scanner will recognise user input"
        System.out.println("Welcome to: Calculator! Please type 1 of four methods: Addition, Subtraction, Multiplication, and Division.");
        String solve = scanner.nextLine();
        //declares that the variable "solve" is equal to the persons input"
        switch (solve) {
            case "Addition":
                System.out.println("Input your first number");
                double number = scanner.nextDouble();
                System.out.println("Input your second number");
                double number2 = scanner.nextDouble();
                //optimize to allow decimal numbers to be added
                number += number2;
                //does math corresponding to the method provided
                System.out.println("The sum is: " + number);
                break;
                //ends the operation, experiment doing this without break to decrease code lines
            case "Subtraction":
                System.out.println("Input your first number");
                double numbersubt = scanner.nextDouble();
                System.out.println("Input your second number");
                double number2subt = scanner.nextDouble();
                numbersubt -= number2subt;
                System.out.println("The difference is: " + numbersubt);
                break;

            case "Multiplication":
                System.out.println("Input your first number");
                double numbermult = scanner.nextDouble();
                System.out.println("Input your second number");
                double number2mult = scanner.nextDouble();
                numbermult *= number2mult;
                System.out.println("The product is: " + numbermult);
                break;
            case "Division":
                System.out.println("Input your first number");
                double numberdiv = scanner.nextDouble();
                System.out.println("Input your second number");
                double number2div = scanner.nextDouble();
                numberdiv /= number2div;
                System.out.println("The quotient is: " + numberdiv);
                break;
            default:
                System.out.println(solve + " is not part of the options!");
                System.out.println("Follow instructions you idiot.");
        }
        System.out.println("Thank you for using calculator, to reuse, restart the program. " );
    }
}

//suggestion: make it so that the calculator can calculate particularly large numbers (optional, requires syntax knowledge)






















/*
  public class Main {
     public static void main(String[] args) {
         int myAge = 13;
         int herAge = myAge;
         System.out.println(herAge);
         System.out.println("My age ("+ myAge + ") +" + " her age (" + herAge + ") is equal to: " + (myAge + herAge) );
     }
 }




public class Main {
    static String hw = "Hello World!";
    public static void main(String[] args) {
        if(hw == "Hello World!") {
            System.out.println("Can confirm, this string is what we should start with!");
            System.out.println(hw);
        }
        else {
            System.out.println("We shouldn't start with this.");
            System.out.println("This is the string... " + hw);
        }




    }
}


















//the code below has been optimized to only input values once!
public class Side {
    static float base = 1;
    public static void main(String[] args){
        System.out.println(base);
        while(base < 15) {
            base += 0.25;
            System.out.println(base);
            if (base >= 15)
                base -= 15;
            if (base == 1) {
                break;
            }

        }
    }
}










 // static String name = "Alex";
// static Integer visit = 14;
// public static void main(String[] args){
//    System.out.println("Hello, " + name + " you are the " + visit + " visitor!");

 */