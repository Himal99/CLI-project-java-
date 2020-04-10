import java.util.Scanner;

public class Atmcontroller {
    Scanner sc = new Scanner(System.in);
    Checking checking = new Checking();
    Saving saving = new Saving();

    public Atmcontroller() {

        while (true) {
            System.out.println("Welcome to our ATM");
            System.out.println("select the account you want to access:");
            System.out.println("Type 1. checking account");
            System.out.println("Type 2. Saving account");
            System.out.println("Type 3. Exit");
            System.out.println("Type 4. Logout");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    checking.control();
                    break;
                case 2:
                    saving.control();
                    break;
                case 3:
                    System.out.println("-----thank you for using----");
                    System.exit(0);
                    break;
                case 4:
                    Regsiter regsiter = new Regsiter();
                    regsiter.login();
                    break;

                default:
                    System.out.println("Wrong input");
                    new Atmcontroller();

            }
        }

    }

}