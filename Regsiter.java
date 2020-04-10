import java.util.Scanner;

public class Regsiter {

    String username;
    String password;
    String repassword;
    Scanner sc = new Scanner(System.in);

    public Regsiter() {
        System.out.println("Choose any one");
        System.out.println("1. Login");
        System.out.println("2. Register");
        String choose = sc.next();
        switch (choose) {
            case "1":
                login();
                break;
            case "2": {
                System.out.println("enter your name:");
                username = sc.next();
                System.out.println("Enter your passowrd:");
                password = sc.next();
                System.out.println("Re-Enter your password:");
                repassword = sc.next();
                if (password.equals(repassword)) {
                    System.out.println("Succesfully Registered your acc\n please Login below");
                    login();
                } else {
                    System.out.println("Password didnt match");
                }

            }
                break;
            default:
                System.out.println("Wrong input");
                new Regsiter();
        }

    }

    public void login() {

        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter your password");
        String pw = sc.next();
        if (name.equals(username) && pw.equals(password)||name.equalsIgnoreCase("himal")&&
        pw.equalsIgnoreCase("himal123")) {
            new Atmcontroller();
        } else {
            System.out.println("Username and password didnt match");
           new Regsiter();
        }
    }
}