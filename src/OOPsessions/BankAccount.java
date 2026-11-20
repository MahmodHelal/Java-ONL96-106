package OOPsessions;

public class BankAccount {
    String accountHolder;
    double balance;


    // Constructor -> special method without return Type wth the same name pf class
    // it is running once object created

    public  BankAccount(String name , double amount){
        accountHolder = name;
        balance = amount;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }


    public void withdraw(double amount){
        balance = balance - amount;
    }

    public void displayInfo(){
        System.out.println("account Name is : " + accountHolder);
        System.out.println("balance is : "+ balance);
    }


}
