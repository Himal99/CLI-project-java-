
public class Saving extends Account {

    @Override
    public void viewbalance() {
        System.out.println("Saving Account Balance: $" + sbalance);
    }

    @Override
    public void withdraw() {
        System.out.println("Enter the amount you want to withdraw:");
        swithdraw = sc.nextInt();
        if (swithdraw > sbalance) {
            System.out.println("You dont have this much of balance/ balance cant be negative.");
        } else {
            sbalance -= swithdraw;
        }
    }

    @Override
    public void deposite() {
        System.out.println("amount you want to deposite in checking account:");
        sbalance += sbalance = sc.nextInt();

    }

    @Override
    public void control() {

        System.out.println("Checking Account:");
        Controll();
    }
}