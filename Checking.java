
public class Checking extends Account {


    @Override
    public void viewbalance() {
        System.out.println("Checking Account Balance: $" + balance);
    }

    @Override
    public void withdraw() {
        System.out.println("Enter the amount you want to withdraw:");
        withdraw = sc.nextInt();
        if (withdraw > balance) {
            System.out.println("You dont have this much of balance/ balance cant be negative.");
        } else {
            balance -= withdraw;
        }

    }

    @Override
    public void deposite() {
        System.out.println("Enter amount you want to deposite in checking account:");
        balance += balance = sc.nextInt();

    }

    @Override
    public void control() {
        System.out.println("Checking Account:");
       Controll();
    }

}