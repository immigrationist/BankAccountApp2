import java.util.Scanner;

public class BankAccountApp {
    public static void main(String[] args) {
        String answer = "yes";
        BankAccount bankAccount1 = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        Person person = new Person();
        int choice = 0;
        boolean success;

        System.out.println("Enter Information:");
        System.out.println("\nName: ");
        person.setName(scanner.next());
        System.out.println("Gender");
        person.setGender(scanner.next().charAt(0));
        System.out.println("Age: ");
        person.setAge(scanner.nextInt());
        System.out.println("Phone Number: ");
        person.setPhoneNumber(scanner.nextInt());
        System.out.println("Home Address: ");
        person.setHomeAddress(scanner.next());
        System.out.println("Height: ");
        person.setHeight(scanner.nextDouble());
        System.out.println("Weight: ");
        person.setWeight(scanner.nextDouble());

        System.out.println("Enter Account Information:");
        System.out.println("\nEnter Account Holder");
        bankAccount1.setAccountHolder(scanner.next());
        System.out.println("Enter Account Number");
        bankAccount1.setAccountNumber(scanner.nextInt());
        System.out.println("Enter date created");
        bankAccount1.setDateCreated(scanner.nextInt());
        System.out.println("enter balance");
        bankAccount1.setCurrBalance(scanner.nextDouble());
        System.out.println("enter withdraw limit");
        bankAccount1.setWithdrawLimit(scanner.nextDouble());

        if (person.getName().equals(bankAccount1.getAccountHolder())) {
            while (choice != 4) {
                System.out.println("Please choose from 4 of the selections:");
                System.out.println("1. DEPOSIT MONEY" + "\n2. WITHDRAW MONEY" +
                        "\n3. CHECK BALANCE" + "\n4. QUIT");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        String stopDeposit = "yes";
                        while (stopDeposit.equalsIgnoreCase("yes")) {
                            System.out.println("Enter amount to deposit");
                            success = bankAccount1.depositMoney(scanner.nextInt());
                            if (success) {
                                System.out.println("Current Balance went up to: " + bankAccount1.getCurrBalance());
                            }
                            System.out.println("Continue, yes/no?");
                            stopDeposit = scanner.next();
                        }
                        break;
                    case 2:
                        String stopWithdraw = "yes";
                        while (stopWithdraw.equalsIgnoreCase("yes")) {
                            System.out.println("Enter amount, your limit is: " + bankAccount1.getWithdrawLimit());
                            success = bankAccount1.withdrawMoney(scanner.nextInt());
                            if (success)
                                System.out.println("Current Balance: " + bankAccount1.getCurrBalance());
                            else System.out.println("Limit reached, balance is: " + bankAccount1.getCurrBalance());

                            System.out.println("Continue, yes/no?");
                            stopWithdraw = scanner.next();
                        }
                        break;
                    case 3:
                        System.out.println(bankAccount1.getCurrBalance());
                        break;
                    case 4:
                        System.out.println("QUIT");
                        break;
                    default:
                }
            }

            System.out.println(person.toString());
            System.out.println(bankAccount1.toString());
        }
        else System.out.println("Account Holder and Personal Information did not match!");
    }

}
