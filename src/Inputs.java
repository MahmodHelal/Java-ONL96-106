import java.util.Scanner;

public class Inputs {

    public static void main(String[] args) {

        /*     int x = 10;
        double y = x;
        System.out.println(y);// 10.0

        double v = 10;
        int z = (int) v;*/


/*        System.out.println("Hello bro");
        System.out.println("Please enter your age ");
        int age =input.nextInt();
        System.out.println("ur age is "+ (2026 - age ));
        System.out.println("Ur Welcome..!");*/

        // common scanner built functions
        // next  One Word  stop with whitespace
        // nextLine free text whole text   stops with enter \n  enter or new line
        // nextInt / nextDouble numbers ->   end by white space after number  -> leave \n for next buffer

//        System.out.println("Please enter your name ");
//        String name = input.nextLine();
//        System.out.println("Hello " + name + "ur welcome");
/*
        System.out.println("Please enter your age ");
        int age =input.nextInt();
        System.out.println("ur age is "+ age);
        System.out.println("Please enter count of ur children");
        int count = input.nextInt();
        System.out.println("ur children count is "+ count);
        System.out.println("Ur Welcome..!");
*/


/*        // your lazy task
        Scanner input =new Scanner(System.in);


        // first ask user for his age
        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println("ur age is "+age);
        // second ask user for his children count
        System.out.println("Please enter count of ur children count");
        int count = input.nextInt();
        System.out.println("ur children count is "+count);
        input.nextLine();
        // third ask user for his name
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("ur name is "+name);
        // ask user to enter his gpa
        System.out.println("Please enter your gpa");
        char gpa  = input.next().charAt(0);
        System.out.println("ur gpa is "+gpa);


        input.close();*/

        // print all info

/*        System.out.println("Please enter your nationality");
        String nationality = input.next();
        System.out.println("ur nationality is "+nationality);*/



        int a = 7;
        int b = 2;

        System.out.println(a/b);//3 -> int / int -> int
        System.out.println((double) a/b);//3.5 -> explicit cast   -  double (explicit casting) / int -> double (implicit casting)

        System.out.println(a % b);  // 1

        System.out.println(a > 5 && b > 5); //false
        System.out.println(!(a == 7) || (b == 2)); //true
        System.out.println(!(a == 7) && (b == 2)); //false
        System.out.println("Total : = " + a + b); //Total : = 72
















    }


}
