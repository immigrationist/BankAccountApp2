public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private int dateCreated;
    private double currBalance;
    private double withdrawMoney;
    private double withdrawLimit;

    public BankAccount(){
        accountHolder = "";
        dateCreated = 0;
        currBalance = 0;
        withdrawLimit = 0;
        accountNumber = 0;
    }

    public int getAccountNumber(){return accountNumber;}
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {return accountHolder;}
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public int getDateCreated() {return dateCreated;}
    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getCurrBalance() {return currBalance;}
    public void setCurrBalance(double currBalance) {

        this.currBalance = currBalance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }
    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public boolean withdrawMoney(double newMoney){
        boolean success = true;
        withdrawMoney += newMoney;

            if(withdrawLimit < withdrawMoney) {
                success = false;
            }
            else {
                currBalance -= newMoney;
                success = true;
            }
        return  success;
    }

    public boolean depositMoney(int newMoney){
        currBalance += newMoney;

        return true;
    }

    public String toString(){
        String info = "";

        info += "\n ACCOUNT NAME: " + getAccountHolder();
        info += "\n ACCOUNT NUMBER: " + getAccountNumber();

        info += "\n DATE CREATED: " + getDateCreated();
        info += "\n CURRENT BALANCE: " + getCurrBalance() + "\n WITHDRAW LIMIT: " + getWithdrawLimit();

        return info;
    }

}
