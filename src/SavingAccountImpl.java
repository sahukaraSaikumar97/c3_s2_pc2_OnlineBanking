public class SavingAccountImpl {
    public static void main(String[] args){
        SavingAccount object = new SavingAccount();
        long accountNumber = object.accNumberGen();
        object.savingAccount("Sai","active",10000);
        double retriveBalance =  object.retriveBalance();
        double withdrawlAmount =  object.withdrawlCash(20000);
        double depositBalance =  object.depositBalance(400);
        double fundTransfer = object.fundTransfer(50000);
        System.out.println("Account number = " +accountNumber);
        System.out.println("Opening Balance = " + retriveBalance);
        System.out.println("balance after withdraw = " + withdrawlAmount);
        System.out.println("Balance after deposit= " + depositBalance);
        System.out.println("balance after fundtransfer = " + fundTransfer);


    }
}