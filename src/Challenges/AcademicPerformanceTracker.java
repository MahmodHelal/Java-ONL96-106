package Challenges;

import java.util.Scanner;

public class AcademicPerformanceTracker {


    /*Inputs  number of students  full name three scores in decimal

Validations  number of students > 0    &&  three scores in decimal → must be in 0 and 100

Logic  calc average and identify grades

output `Student Name -> Average: XX.XX, Grade: X`*/
    public static void main(String[] args) {
        // count of students
        Scanner input = new Scanner(System.in);


        System.out.println("Please enter number of students");
        int count = input.nextInt();
        input.nextLine();

        if (count <= 0){
            System.out.println("Student count must be positive");
            return;
        }

        for (int i = 0 ; i< count ;i++){
            String name = input.nextLine();

            double s1 = readScore(input);
            double s2 = readScore(input);
            double s3 = readScore(input);
            input.nextLine();

            double average = calcAverage(s1,s2,s3);
            char grade = getGrade(average);

            System.out.println(getResult(name,average,grade));

        }
    }
// Student Name -> Average: XX.XX, Grade: X
    public static  double readScore(Scanner input){
        double score;
        do {
             score = input.nextDouble();
            if (score <0 || score > 100 ){
                System.out.println("score must be between 0 and 100");
            }
        }while (score <0 || score > 100 );
        return score;
    }

    public static double calcAverage(double s1, double s2, double s3){
        return (s1 + s2 + s3) /3;
    }

    public  static  char getGrade(double average){
        if (average >= 85){
            return 'A';
        } else if (average >= 70) {
            return  'B';
        } else if (average >= 50) {
            return 'C';
        }else return 'F';
    }

    //Student Name -> Average: XX.XX, Grade: X
    public static  String getResult(String name, double average , char grade){
        return "Student " + name + " -> Average " + average + ", Grade :  "+ grade;
    }

}
