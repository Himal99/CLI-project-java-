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

                    System.out.println("Are you sure want to exit ? yes/No");
                    String choice2 = sc.next();
                    if (choice2.equalsIgnoreCase("yes")) {
                        System.out.println("-----thank you for using----");
                        System.exit(0);
                    } else {
                        new Atmcontroller();
                    }

                    break;
                case 4:
                    System.out.println("Are you sure want to Logout ? yes/No");
                    String choice3 = sc.next();
                    if (choice3.equalsIgnoreCase("yes")) {
                        Regsiter regsiter = new Regsiter();
                        regsiter.login();
                    } else {
                        new Atmcontroller();
                    }
                    break;

                default:
                    System.out.println("Wrong input");
                    new Atmcontroller();

            }
        }

    }

}