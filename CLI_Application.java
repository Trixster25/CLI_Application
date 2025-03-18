import java.util.Scanner;

public class CLI_Application {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) { 
            System.out.println("\n===================================");
            System.out.println("||    Welcome to T-Enterprise    ||");
            System.out.println("===================================");
            System.out.println("1. Log-In");
            System.out.println("2. Register");
            System.out.println("3. Forgot Password");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            int choice = input.nextInt();
            input.nextLine(); 

            if (choice == 1) {
                System.out.print("Username: ");
                String user = input.nextLine();
                System.out.print("Password: ");
                String pass = input.nextLine();

                System.out.println("Logging in with Username: " + user);
                

            } else if (choice == 2) {
                System.out.print("First Name: ");
                String fname = input.nextLine();
                System.out.print("Last Name: ");
                String lname = input.nextLine();
                System.out.print("Age: ");
                int age = input.nextInt();
                input.nextLine(); 
                System.out.print("Birthday (YYYY-MM-DD): ");
                String bday = input.nextLine();
                System.out.print("Gender: ");
                String gen = input.nextLine();
                System.out.print("Choose Username: ");
                String nuser = input.nextLine();
                System.out.print("Choose Password: ");
                String npass = input.nextLine();

                System.out.println("\nRegistration Successful!");
                System.out.println("Firstname: " + fname);
                System.out.println("Lastname: " + lname);
                System.out.println("Age: " + age);
                System.out.println("Birthday: " + bday);
                System.out.println("Gender: " + gen);
                System.out.println("Username: " + nuser);
                System.out.println("Password: " + npass);

            } else if (choice == 3) {
                System.out.print("Enter remembered username: ");
                String username = input.nextLine();
                System.out.println("Checking for username: " + username);
                

            } else if (choice == 4) {
                System.out.println("Thank you for using T-Enterprise!");
                break; 

            } else {
                System.out.println("Invalid Input! Please enter a valid option.");
                continue;
            }
        }

        input.close();
    }
}
