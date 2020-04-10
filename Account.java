import java.util.Scanner;

public abstract class Account {

    Scanner sc = new Scanner(System.in);

    int balance = 0;
    int deposite = 0;
    int withdraw = 0;

    int sbalance = 0;
    int sdeposite = 0;
    int swithdraw = 0;

    public abstract void viewbalance();

    public abstract void withdraw();

    public abstract void deposite();

    public abstract void control();

    public void crud() {
        System.out.println("1. view balance");
        System.out.println("2. withdraw funds");
        System.out.println("3. Deposite balance");
        System.out.println("4. exit");
    }

    public void Controll() {
        while (true) {

            crud();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    viewbalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposite();
                    break;
                case 4:
                    Atmcontroller con = new Atmcontroller();
                    break;
                default:
                    System.out.println("wrong input");
                    control();

            }
        }
    }

}