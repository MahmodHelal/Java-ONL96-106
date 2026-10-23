public class DataTypes {

// main  //psvm

    final static int a = 10;
    static float b;
    static double c;
    static boolean e;
    static String f;


    public static void main(String[] args) {


/*        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println(f);*/



        // in the lin of output print that "Hello My name is Helal my age is 30"
        //but in class code write two statements
/*
        int num = 10;

        System.out.print("A");
        System.out.println("B");
        System.out.printf("num is %d %n", num);
*/
/*


        String name = "Helal";
        System.out.println("My name " +                      name);
        int age = 30;
        System.out.println("My age is "   +         age);
        double salary = 10000.5678;
        System.out.println("My salary is " + salary);


        System.out.println("***************");
        System.out.println("***************");
        System.out.println("***************");
        System.out.println("***************");
        System.out.println("***************");
        System.out.println("***************");
        System.out.printf("my name is %s my age is %d my salary is %.2f %n",name,age,salary);
        System.out.println("Hello " + name + " you are welcome");
        System.out.println("my name is " +name+ " my age is "+ age +" my salary is \n" +salary);
        System.out.println("***************");
        */

/*
        // declaration  // dataType variableName
        int number;
        // initialization  // variableName = value;
        number = 30;
        // declaration and initialization  // dataType variableName = value;
        double number2 = 50;

        //dataType variableName = value;

        int    age    = 25;
        double price  = 149.99;
        char   grade  = 'A';
        boolean isLoggedIn = false;
        String name   = "Mahmoud";


        byte byteVar = 10;
        short shortVar = 10000;
        int intVar = 1000000000;
        double doubleVar = 10000000000000000000.55555;

        float floatVar = 10.10f;
        long lonVar = 2999900000L;

*/


        // primitive data Types
        // byte short int long float double char boolean
 /*       int num1 = 10;
        int num2 = 20;
        int num3 = 10;*/

        // diff between =  and ==
 /*       System.out.println(num1 == num2);
        System.out.println(num1 == num3);
*/
        //non primitive data Types -> Reference Types
        // String object any class arrays

/*        String name1 = "Helal";
        String name2 = "Helal";
        String name3 = "helal";
        String name4 = new String("Helal");

        // built in functions

        System.out.println(name1.equals(name4));//? true content
        System.out.println(name1 == name4);//? false reference

        int num1 = 10;
        int num2 = 20;
        int num3 = 10;



        System.out.println(num1 == num2);
        System.out.println(num1 == num3);

*//*        System.out.println(name1 == name2);
        System.out.println(name1 == name3);
        System.out.println(name1 == name4);*//*
        */
/*
        String text =  "    Welcome, Mahmoud Helal   ";
        System.out.println(text.toUpperCase());
        System.out.println(text.toLowerCase());
        System.out.println(text.trim());
        System.out.println(text.trim().charAt(5));
        System.out.println(text.contains("Mahmoud"));*/


        // initialize an attribute as any number
        // then in one statement print if the number is even or not
        // hint %  is  true and true = true  true and false = false
        // output -> the number 2 is even ? true

/*        int num = 2;
        System.out.println("The number "+ num +" is even ? "+   ( num % 2 == 0 )   );*/


/*        boolean x = false;

        x = num % 2 == 0;*/

        // && &

        // w3school beginners
        // java tutorial
        // hackerrank
        // leetcode

/*
        System.out.println(3 + 4 + "3");
        // 3 int   + 4 int -> 7 + "3" -> 73
        System.out.println("3" + 4 + 3); // 343
        // "3" + 3  -> "33"  + 4  ->  334
        System.out.println("Sum: " + (3 + 4));


        System.out.println(1 + 2 / 3 + (2 + 2) * (4 * 4));//65 //65 //65.666 //65
        // 1 + 2 / 3 + (4) * (4 * 4)
        // 1 + 2 / 3 + (4) * (16)
        //1 + (0.666) + 4 * 16
        //1 + 0.666 + 64
        // 65.66666
        //65
*/

       /* System.out.println(3 / 2 * 3 / 4);*/


/*
        int x = 10;// ==compare =assign
        System.out.println(x + 1);// 11  // value of x = 10 sout(10 + 1) -> 11
        x = x + 2;//12  // x = 10 + 2
        System.out.println(x);//12*/

        int num = 10;
        num = num + 1;// num += 1;
        num = num + 5;// num += 5;
        num = num /2;// num/=2;

        num  = num +1; // num += 1; //num++ //++num

        //num++ //++num  -> num = num +1;
        num = 10;
        System.out.println(num++);
        num = num + 3;
        System.out.println(num);//14
        System.out.println(++num);
        num++;
        System.out.println(num++);
        System.out.println(++num);




















    }


}
