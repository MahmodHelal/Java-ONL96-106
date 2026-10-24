import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        // IF statement


        // if (condition){
        // block of code run when condition is true
        // }



    /*        double total = 150;

            if (total >= 200){
                System.out.println("Free delivery");
            }
            System.out.println("Rejected");
            System.out.println("Hello I am Helal");

            */
            // ask user for his age
            // if age >= 18 print accepted
       /* Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();
        if (age > 18){
            System.out.println("Accepted");
        }


        System.out.println("Hello I am Helal");

*/
// if(condition){
// block of code will run if condition is true
// } else{
// run this block of code if condition is false
// }

        // if age >= 18 print accepted otherwise rejected
/*        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = input.nextInt();
        if (age > 18){
            System.out.println("Accepted");
        }else {
            System.out.println("Rejected");
        }
        System.out.println("Hello I am Helal");

        // task ask user to enter an integer and print even or odd*/


        // if (condition1){
        // block of code run when condition1 is true
        // }else if (condition2){
        // block of code run when condition2 is true
        // }else if (condition3){
        // block of code run when condition3 is true
        // }else{
        // run this block of code if none of the conditions are true
        // }
/*
        int score = 60;
        if (score >= 90){
            System.out.println("A");
        } else if (score >= 50) {
            System.out.println("E");
        } else if (score >= 80) {
            System.out.println("B");
        }else if (score >= 70){
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }*/

        // task
        // ask user for his age and his nationality
        // if he is 18 or upper
        // and
        // his nationality is egyptian
        // print eligible to vote otherwise not eligible
//        Scanner input = new Scanner(System.in);
/*        System.out.println("Please enter your age");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Please enter your nationality");
        String nationality = input.nextLine();
        if (age >= 18 && nationality.equalsIgnoreCase("Egyptian")){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }*/
//        Scanner input = new Scanner(System.in);



/*
        String correctUsername = "admin";
        String correctPassword = "123456";
        // ask user for username and password
        // if username and password is correct print Welcome
        // if username not correct  do not check password print user not found // done
        // if password incorrect print Invalid password

// nested if
        System.out.println("Please enter your username");
        String actualUsername = input.nextLine();
        if (correctUsername.equals(actualUsername)){
            System.out.println("Please enter your password");
            String actualPassword = input.nextLine();
            if (correctPassword.equals(actualPassword)){
                System.out.println("Welcome");
            }else {
                System.out.println("Invalid password");
            }
        }else {
            System.out.println("User not found");
        }
*/


        //task ask user to enter an integer and print even or odd

/*        System.out.println("Please enter an integer");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }*/
// ternary operator
/*        int num = 51;
        String result =num % 2 == 0 ? "Even" : "Odd";
        System.out.println(result);
        int a = 10;
        int b = 25;
        int max = a > b ? a : b;
        System.out.println(max);*/


        // switch case


        // switch (expression){
        // case value1:
        // block of code
        // break;
        // case value2:
        // block of code
        // break;
        // default:
        // block of code
        // }

/*
        int day = 1;

        switch (day){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }

int x = 10;
Integer y = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a grade");
        char grade = input.next().toUpperCase().charAt(0);
//        grade = Character.toUpperCase(grade); //wrapper class
        switch (grade){
            case  'A' :
                System.out.println("Excellent");
            break;
            case 'B':
                System.out.println("Good");
            break;
            case 'C':
                System.out.println("Average");
                break;
            default:
                System.out.println("Invalid grade");
        }
*/


        //---  ---   ---
        // Calculator
        // ask user to enter two numbers and symbol (+ , - , * , /) then print result
        // i need result like this syntax
        // please enter first number : 4
        // please enter second number : 2
        // please enter symbol  :  /
        // result is  ->    4 / 2 = 2   ---    1 + 2 = 3

/*
Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number");
        double firstNumber =  input.nextDouble();

        System.out.println("Please enter second number");
        double secondNumber = input.nextDouble();

        System.out.println("Please enter symbol like + - * / ");
        char symbol = input.next().charAt(0);
        double result = 0;
        boolean isInvalidSymbol = false;
        switch (symbol){
            case '+':
                     result = firstNumber + secondNumber;
                break;
            case '-':
                     result = firstNumber - secondNumber;
                break;
            case  '/':
                     if (secondNumber != 0){
                         result = firstNumber / secondNumber;
                     }
                break;
            case '*':
                     result = firstNumber * secondNumber;
                break;
            default:
                isInvalidSymbol = true;
                System.out.println("Invalid symbol");
        }
                if (symbol == '/' && secondNumber == 0 ) {
                    System.out.println("second number cannot be zero");
                }
                else if (isInvalidSymbol){
                        System.out.println("Invalid symbol");

                }
                else {
                    System.out.println(firstNumber+ " " + symbol+ " " + secondNumber+ " = " + result);
                }


*/

/*
        int day = 11;

        switch (day){
            case 1:
            case 7:
            case 8:
            case 9:
                System.out.println("Saturday");
                break;
            case 3, 10, 11, 12:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
*/

/*        int month =  7;

        switch (month){
            case 12,1,2:
                System.out.println("Winter");
                break;
            case 3,4,5:
                System.out.println("Spring");
                break;
            case 6,7,8:
                System.out.println("summer");
                break;
            default:
                System.out.println("Invalid month");
        }*/




/*
        int month =  7;

        switch (month){
            case 12,1,2 -> System.out.println("Winter");
            case 3,4,5-> System.out.println("Spring");
            case 6,7,8 -> System.out.println("summer");
            default -> System.out.println("Invalid month");
        }
*/








    }
}
