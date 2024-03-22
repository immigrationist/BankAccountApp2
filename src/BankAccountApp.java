import java.util.Scanner;

public class BankAccountApp
{
    public static void main(String[] args)
    {
        String name = "";
        char gender = ' ';
        int age = 0;
        String homeAddress = "";
        int phoneNumber = 0;

        int choice = 0;
        boolean success;

        String answer = "yes";
        BankAccount bankAccount1 = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        Person person = new Person(name, gender, age, homeAddress, phoneNumber);


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

        System.out.println("\n");
        bankAccount1.setAccountHolder(person);
        System.out.println("Enter Account Number");
        bankAccount1.setAccountNumber(scanner.nextInt());
        System.out.println("Enter date created");
        bankAccount1.setDateCreated(scanner.nextInt());
        System.out.println("enter balance");
        bankAccount1.setCurrBalance(scanner.nextDouble());
        System.out.println("enter withdraw limit");
        bankAccount1.setWithdrawLimit(scanner.nextDouble());

        while (choice != 4)
        {
            System.out.println("Please choose from 4 of the selections:");
            System.out.println("1. DEPOSIT MONEY" + "\n2. WITHDRAW MONEY" +
                    "\n3. CHECK BALANCE" + "\n4. QUIT");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("Enter amount to deposit");
                    success = bankAccount1.depositMoney(scanner.nextInt());
                    if (success)
                        System.out.println("Current Balance went up to: " + bankAccount1.getCurrBalance());
                    break;
                case 2:
                    System.out.println("Enter amount, your limit is: " + bankAccount1.getWithdrawLimit());
                    success = bankAccount1.withdrawMoney(scanner.nextInt());
                    if (success)
                        System.out.println("Current Balance: " + bankAccount1.getCurrBalance());
                    else
                        System.out.println("Limit reached, balance is: " + bankAccount1.getCurrBalance());
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
        System.out.println(bankAccount1.toString());
    }
}
