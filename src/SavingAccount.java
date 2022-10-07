

public class SavingAccount {
    String accountHolderName;
    long accountNumber;
    String accountStatus;
    double accountBalance;

    public void savingAccount(String accountHolderName, String accountStatus, int accountBalance) {
        this.accountHolderName = accountHolderName;
        this.accountStatus = accountStatus;
        this.accountBalance = accountBalance;
    }
    public long accNumberGen(){
        accountNumber = (long) (Math.random()*1000000000000L);
        return accountNumber;
    }
    public double retriveBalance(){

        return accountBalance;

    }
    public double depositBalance(int amount){
        accountBalance+= amount;
        return accountBalance;

    }
    public double withdrawlCash(int amount){
        if (accountBalance > amount ){
            accountBalance -= amount;
        }else {
            System.out.println("Withdrawl  failed due to insufficient funds");
        }

        return accountBalance;
    }


    public double fundTransfer(int amount){
        if (accountBalance > amount ){
            accountBalance-= amount;
        }else {
            System.out.println("Transfer failed due to insufficient funds");
        }
        return accountBalance;
    }

}

