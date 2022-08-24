public class SavingAccountImpl {
    public static void main(String[] args){
        SavingAccount object = new SavingAccount();
        long accountNumber = object.accountNumber();
        object.savingAccount("Sai","active",5000);
        double withdrawlAmount =  object.withdrawlCash(2000);
        double retriveBalance =  object.retriveBalance();
        double depositBalance =  object.depositBalance(400);
        double fundtransfer = object.fundTransfer(500);
        System.out.println(" account number = " +accountNumber);
        System.out.println("withdrawlAmount = " + withdrawlAmount);
        System.out.println("retriveBalance = " + retriveBalance);
        System.out.println("depositBalance = " + depositBalance);
        System.out.println("fundtransfer = " + fundtransfer);


    }
}