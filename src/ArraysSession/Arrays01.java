package ArraysSession;

import java.util.Scanner;

public class Arrays01 {


    public static void main(String[] args) {
       /* int number1 = 1;
        int number2 = 2;
        int number3 = 3;
        int number4 = 4;
        int number5 = 5;


        // DataType[] arrayName;
        // DataType[] arrayName = {value1,value2};
        // DataType[] arrayName = new dataType[size];
 *//*       int[] numbers1;
        int[] numbers2 = {1,2,3,4,5};
        int[] numbers3 = new int[5];*//*


        int score1 = 85;
        int score2 = 92;
        int score3 = 78;
        int score4 = 96;
        int score5 = 88;

        int[] scores = new int[1000];
        int[] marks = {85, 92, 78, 96, 88};
        // for access any element of array  -> arrayName[index]

        System.out.println(marks.length);//5
        System.out.println(marks[0]);//85
        System.out.println(marks[1]);//92
        System.out.println(marks[2]);//78
        System.out.println(marks[3]);//96
        System.out.println(marks[4]);//88
//        System.out.println(marks[5]);// throw exception outofbound
        /// /////////
        int[] numbers2 = {10, 20, 30, 40};
        System.out.println(numbers2.length);//4
        System.out.println(numbers2[0]);//10
        System.out.println(numbers2[1]);//20
        System.out.println(numbers2[2]);//30
        System.out.println(numbers2[3]);//40

        int[] numbers3 = new int[3];
        System.out.println(numbers3.length);// 3
        System.out.println(numbers3[2]);// 0
        numbers3[0] = 55;
        System.out.println(numbers3[0]);//55

        double[] doubles = new double[3];
        System.out.println(doubles.length);// 3
        System.out.println(doubles[2]);// 0.0
        doubles[1] = 44;
        System.out.println(doubles[1]);//44.0

        String[] names = new String[3];
        System.out.println(names.length);// 3
        System.out.println(names[2]);// null
        names[2] = "Helal";
        System.out.println(names[2]);


*/
        /*
        last element off array -> index = browser.length - 1
        for print
        sout(browsers[0]);
        sout(browsers[1]);
        sout(browsers[2]);
        for assign
        browser[0] = "Edge"
        browser[1] = "Chrome"
        browser[2] = "FireFox"
        */
        String[] browsers = new String[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < browsers.length; i++) {
            System.out.println("pleas enter browser for index : "+ i);
            browsers[i] = input.nextLine();
        }
        for (int i = 0; i <= browsers.length - 1; i++) {
            if (browsers[i].equalsIgnoreCase("Edge")) {
                browsers[i] = "Safari";
                System.out.println("The index of safari is : " + i);
            }
        }
        System.out.println("from traditional for ");
        for (int i = 0; i < browsers.length ;i++){
            System.out.print(browsers[i] + " ");
        }
        System.out.println();
        System.out.println("from enhanced for ");
        // enhanced for -> for each
        for(String browser : browsers){
            System.out.print(browser + " ");
        }

        // declare an array
        // scores with values  -> 85, 92, 78, 96, 88
        // print max and min and their indexes
        // then print average of marks
        // and print sum of all marks





    }
}
// arrays - classes and objects
// OOP 4 principles 4
// Selenium Tool 4
// Testng Framework " Exec and Assertion " 2
// Cucumber " BDD " Given When Then 1
// Appium 3
// Performance 2
// DB 3