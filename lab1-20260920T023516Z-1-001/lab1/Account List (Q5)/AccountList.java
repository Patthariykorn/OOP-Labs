public class AccountList {
    private Account[] accounts;
    private int count;

    public AccountList(int size) {
        accounts = new Account[size];
        count = 0;
    }

    public boolean appendAccount(Account account) {
        if (count < accounts.length) {
            accounts[count] = account;
            count++;
            return true;
        }

        return false;
    }

    public Account getAccount(int idx) {
        if (idx >= 0 && idx < count) {
            return accounts[idx];
        }

        System.out.println("Input index exceeds the number of appended elements");
        return null;
    }
}


class AccountListTest {

    public static void main(String[] args) {

        AccountList al = new AccountList(3);

        boolean success = al.appendAccount(new Account("Oak", 1.0));
        success = al.appendAccount(new Account("Two", 0.1));

        Account account = al.getAccount(2);
        System.out.println(account);

        account = al.getAccount(1);
        System.out.println(account.getBalance());

        success = al.appendAccount(new Account("tmp", 0));
        success = al.appendAccount(new Account("tmp2", 0));

        System.out.println(success);
    }
}