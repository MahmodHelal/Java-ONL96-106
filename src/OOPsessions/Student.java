package OOPsessions;

public class Student {
    // Attributes
    // name - age - gpa
    String name;
    int age;
    double gpa;


    public void study(){
        System.out.println(name + " is studying ...");
    }

    public void displayInfo(){
        System.out.println("name is :" + name);
        System.out.println("age is :" + age);
        System.out.println("gpa is :" + gpa);
    }



}
