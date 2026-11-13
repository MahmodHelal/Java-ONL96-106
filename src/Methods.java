import java.util.Scanner;

public class Methods {

    /*
    accessModifier 'static nonStatic' returnType methodName(Params){
        //block of code;
    }
    //call method by nameOfMethod(arguments);
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


/*        String name = "Ahmed";
//        System.out.println("Hello "+ name);
//        System.out.println("UR Welcome ");
        greeting(name);
        String name2 = "Ali";
//        System.out.println("Hello "+ name2);
//        System.out.println("UR Welcome ");
        greeting(name2);
        String name3 = "Mahmoud";
//        System.out.println("Hello "+ name3);
//        System.out.println("UR Welcome");
        greeting(name3);*/

        int number1 = 10;
        int number2 =11;

            int result =    add(number1, number2);
        // w3school
        // leetcode

    }

    public static int add(int num1,int num2){
        System.out.println(num1 + num2);
        return num1 + num2;
    }

    public static void greeting(String name){
        System.out.println("Hello "+ name);
        System.out.println("UR Welcome");
    }



    // create method that add two numbers then display results
    // create method that took a number then validate it is even or odd
    // create method that took degree and print grade of it like
        // -- 90 -> print "Excellent" and so on
    // create method that took a number and print its factorial
    // create  a method that took two numbers and symbol then print result
}




































