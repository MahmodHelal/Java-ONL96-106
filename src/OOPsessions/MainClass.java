package OOPsessions;

public class MainClass {
    public static void main(String[] args) {

/*        Student studentOne = new Student();
        Student studentTwo = new Student();
        studentOne.name = "Helal";
        studentOne.age = 30;
        studentOne.gpa = 3.4;
        studentOne.study();
        studentOne.displayInfo();

        studentTwo.name = "Mahmoud";
        studentTwo.age = 28;
        studentTwo. gpa = 2.5;
        studentTwo.displayInfo();
        studentTwo.study();*/

        BankAccount account1 = new BankAccount("Helal", 1000);
        account1.accountHolder = "Helal";
        account1.balance = 500;
        account1.deposit(200);
        account1.withdraw(400);
        account1.displayInfo();
        account1.withdraw(150);
        account1.displayInfo();

        BankAccount account2 = new BankAccount("Mahmoud",500);
        account2.displayInfo();

        BankAccount account3 = new BankAccount();
        account3.displayInfo();


    }
}
