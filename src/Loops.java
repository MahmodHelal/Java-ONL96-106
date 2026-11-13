import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
/*
 // Loops
        // 1. For loop
        // 2. While loop
        // 3. Do while loop

        // for(initialization ; condition ; increment/ decrement ){
        // block of code
        // }


        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        System.out.println("----------------");
        for (int x = 1 ; x <= 5 ; x++){
            System.out.println(x);
        }
        System.out.println("----------------");
        for (int x = 50 ; x <= 100; x+=10){
            System.out.println(x/10);
        }
        // print from 5 to 1
        for (int i = 5 ; i >= 1; i-=1)
            System.out.println(i);
        // print odd numbers from 1 to 11
        for (int i = 1; i <= 11 ; i++ ){
            if (i % 2 == 0){
                continue;
            }{
                System.out.println(i);
            }
        }
        for (int i = 1; i <= 11; i+=2){
            System.out.println(i);
        }


        // please enter max number
        // 10
        // 1 2 3 4 5 6 7 8 9 10
        // sum = 55




        */
/*        Scanner input = new Scanner(System.in);
        System.out.println("Please enter max number");
        int maxNumber = input.nextInt();
        int sum = 0;

        for (int i = 1;  i <= maxNumber ; i++){
            System.out.print(i + " ");
              sum = sum + i;
        }
        System.out.println("\nSum : " + sum);*/


/*
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a mul number");
        int mulNumber = input.nextInt();
        for (int i = 1;  i <= 12; i++ ){
            System.out.println(i * mulNumber);
        }
        // 5 x 1 = 5
        for (int i = 5;  i <= 12; i++ ){
            System.out.println(mulNumber +" x "+ i + " = "+ (mulNumber * i)  );
        }*/
        // input -> mullnumber
        // loop start 1 end 12
        // print 5 x 1 = 5



        // - break -> continue
        // break -> exit the loop
        // continue -> skip the current iteration



        // 1 -> 10 except 5
/*
        for (int i = 1; i<= 10 ; i++){

            if (i % 2 == 0){
                continue;
            }else {
                System.out.println(i);
            }

            if (i == 8){
                break;
                //sout("Hello");
            }

        }*/

/*        System.out.println("After loop");

        for (int i = 1; i<= 50 ; i++){

            System.out.println(i);
            if (i == 3 ){
                continue;
            } else if (i == 4) {
                break;

            }
            System.out.println("bl7");


        }*/
        // ---

// 5 x 1 = 5
// 5 x 2 = 10
// 5 x 3 = 15
// 5 x 4 = 20
// 5 x 5 = 25  ....    5 x 12 = 60




/*
        for (int i = 5 ; i<= 10 ; i++){
            for ( int j = 1; j <= 12 ; j++){
                System.out.println(j + " x " + i + " = " + (i * j));
            }

        }


        // by using juts one *
        // print  * * * * *
        System.out.print("* "             );
        System.out.print("* "             );
        System.out.print("* "             );
        System.out.print("* "             );
        System.out.print("* "             );*/

/* for (int j = 1 ; j <= 5 ; j++){

     for (int i = 1 ; i <= j ; i++){

         System.out.print("* ");

     }

     System.out.println();
    }*/

 /*

 *
 * *
 * * *
 * * * *
 * * * * *

 */

/*

        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *


        */


        // factorial
        // 2! -> 1 * 2 = 2
        // 5! -> 1 *  2 * 3 * 4 * 5 = 120
        // 6! -> 1 * 2 * 3 * 4 * 5 * 6 = 720

/*
        int target = 6;
        int factorial = 1;
        for (int i = 1 ; i <= target; i++){
//            factorial = factorial * i;
            factorial *=i;
        }
*/


        // 1! = 1
        // 2! = 2
        // 3! = 6
        // 4! = 24
        // target! = factorial



        // While loop
        // print 1 - > 5

        // while(condition){
        // block of code
        // }
/*

        // int i = 10;
        System.out.println("For Loop");
        for (int i = 1; i <= 5 ; i++){
            System.out.print(i + " ");
        }
        // System.out.println(i); -> error

        System.out.println("\nWhile Loop");
        int counter = 1;
        while (counter <= 5){
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println("counter after while" + counter);

*/


        // ask user enter positive
        // 7
        // accepted you entered 7
        //--
        // -2
        // invalid
        //ask user enter positive
        // -10
        // invalid
        //ask user enter positive
        // -11
        // invalid
        //ask user enter positive
        //10
        // accepted you entered 10
      /*  Scanner input = new Scanner(System.in);
        String expectedPassword = "1234";
        String expectedUsername = "admin";
        int attempts = 0;
        final int MAX_ATTEMPTS = 3;
        boolean isLoggedIn = false;
    while (attempts < MAX_ATTEMPTS){
        System.out.println("please enter your username");
        String actualUsername = input.next();
        System.out.println("please enter your password");
        String actualPassword = input.next();
        if (expectedPassword.equals(actualPassword) && expectedUsername.equals(actualUsername)){
            isLoggedIn = true;
            System.out.println("Success Login");
            break;
        }else {
            attempts = attempts + 1; //attempts++
            System.out.println("Invalid Credentials");
            System.out.println("Remaining " +(MAX_ATTEMPTS - attempts));
        }
    }
    if (!isLoggedIn){
        System.out.println("Account is Locked");
    }*/


        // do while



        //do{
        // block of code
        // }while(condition);


/*        int y = 10;
        while (y < 5){
            System.out.println("While executed");
        }

        System.out.println("**********************");

        do {
            System.out.println("do-while executed");
        } while (y < 5);*/




/*        int x = 1;

        while (x <2){
            ++x;
        }
        System.out.println("*****************");
        do {
            ++x;
        }while (x<2);

        System.out.println(x); //3 //3 //3


        // break -> exit loop
        // continue -> skip current iteration



        for (int i = 0 ; i<= 10 ; i++){
            System.out.print(i+ " ");
            if (i == 5){
                continue;
            }
            System.out.println("Print for all except 5 'FIVE' ");
        }*/








    }


}








