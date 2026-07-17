class Account {
    // private int balance;
    int balance;
    // For Default Constructor
    Account(){

    }
    // Constructor , Parameterized Constructor
    Account(int balance){
        this.balance = balance;
    }

    void debit(int amount){
        // Emcapsulation
    // for invalid operation
    if (amount<= this.balance && amount>=0) {
            this.balance -= amount;
    }
    }

    void credit(int amount){
        // Encapsulation
        // for invalid operation
            if (amount > 0) {
                this.balance += amount;
            }   
    }

    @Override
    public String toString() {
        return "Account [balance=" + balance + "]";
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        // Using Parameterized Constructor for initial values
        Account acc1 = new Account(5000);
        Account acc2 = new Account(8000);

        // for Default Constructor
        Account acc3 = new Account();

        // acc1.balance = 1000;
        // invalid operation
        // acc1.debit(500);
        // acc1.credit(1000);
        System.out.println("acc1 " + acc1);// with parameterized constructor for initial value
        System.out.println("acc2 " + acc2); // with parameterized constructor for initial value
        System.out.println("acc3 " + acc3); //with default constructor for initial value
    }

}
