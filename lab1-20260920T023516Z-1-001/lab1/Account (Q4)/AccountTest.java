class AccountTest {

    public static void main(String[] args) {

        Account account = new Account("Oak", 100.0);

        // Read name and balance
        System.out.println(account.getName());
        System.out.println(account.getBalance());

        // Modify name
        account.setName("Two");
        System.out.println(account.getName());

        // Deposit valid amount
        account.deposit(50.0);
        System.out.println(account.getBalance());

        // Deposit invalid amount
        account.deposit(-20.0);
        System.out.println(account.getBalance());

        // Create account with non-positive balance
        Account account2 = new Account("Test", -100.0);
        System.out.println(account2.getBalance());
    }
}