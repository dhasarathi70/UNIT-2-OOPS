public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select account type:");
        System.out.println("1. Savings Account");
        System.out.println("2. Current Account");

        int n = sc.nextInt();

        System.out.println("Enter initial balance:");
        double balance = sc.nextDouble();

        BankAccount account = null;

        if (n == 1) {
            account = new SavingsAccount(balance);
        } else if (n == 2) {
            account = new CurrentAccount(balance);
        }

        if (account != null) {
            System.out.println("Choose operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");

            int op = sc.nextInt();
            System.out.println("Enter amount:");
            double amount = sc.nextDouble();

            if (op == 1) {
                account.deposit(amount);
            } else if (op == 2) {
                account.withdraw(amount);
            } else {
                System.out.println("Invalid operation!");
            }
        }

        sc.close();
    }
}
