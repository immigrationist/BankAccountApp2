public class BankAccount
{
    private int accountNumber;
    private Person accountHolder;
    private int dateCreated;
    private double currBalance;
    private double withdrawMoney;

    private double withdrawLimit;

    public BankAccount()
    {
        dateCreated = 0;
        currBalance = 0;
        withdrawLimit = 0;
        accountNumber = 0;
        withdrawMoney = 0;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber)
    {
        if(accountNumber > 0)
            this.accountNumber = accountNumber;
    }

    public Person getAccountHolder()
    {
        return accountHolder;
    }

    public void setAccountHolder(Person accountHolder)
    {
        this.accountHolder = accountHolder;
    }

    public int getDateCreated()
    {
        return dateCreated;
    }
    public void setDateCreated(int dateCreated)
    {
        if(dateCreated > 0)
            this.dateCreated = dateCreated;
    }

    public double getCurrBalance()
    {
        return currBalance;
    }
    public void setCurrBalance(double currBalance)
    {
        if(currBalance > 0)
            this.currBalance = currBalance;
    }

    public double getWithdrawLimit()
    {

        return withdrawLimit;
    }
    public void setWithdrawLimit(double withdrawLimit)
    {
        if(withdrawLimit > 0)
            this.withdrawLimit = withdrawLimit;
    }

    public boolean withdrawMoney(double newMoney)
    {
        boolean success = false;

        if(currBalance >= newMoney && newMoney <= withdrawLimit)
        {
            if (withdrawLimit <= withdrawMoney)
            {
                success = false;
            }
            else
            {
                currBalance -= newMoney;
                withdrawMoney += newMoney;
                success = true;
            }
        }

        return  success;
    }

    public boolean depositMoney(double newMoney)
    {
        if(newMoney > 0)
            currBalance += newMoney;

        return true;
    }

    public String toString()
    {
        String info = "";

        info += getAccountHolder() + "\n";
        info += "\n ACCOUNT NUMBER: " + getAccountNumber();

        info += "\n DATE CREATED: " + getDateCreated();
        info += "\n CURRENT BALANCE: " + getCurrBalance() + "\n WITHDRAW LIMIT: " + getWithdrawLimit();

        return info;
    }

}
