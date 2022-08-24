import java.util.Random;

public class SavingAccount {
    String accountHolderName;
    String accountStatus;
    int accountBalance;

    public void savingAccount(String accountHolderName, String accountStatus, int accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountStatus = accountStatus;
        this.accountBalance = accountBalance;
    }
    public long accountNumber() {
        Random obj = new Random();
        long number = 0;
         long accountNumber = obj.nextLong(100000000000l);
        System.out.println(number);
        return number;
    }
    public double withdrawlCash(int amount){

        return accountBalance - amount;

    }
    public double retriveBalance(){
        return accountBalance;

    }
    public double depositBalance(int amount){
        return accountBalance+ amount;

    }
    public double fundTransfer(int amount){
        return (accountBalance- amount);
    }
}

