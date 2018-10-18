package test.com.ling.model;

public class AccountHolders extends Bank {

    private String accountHolderName;
    private String accountType;
    private String accountBalance;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    //Converting Object to toString
    public String toString()
    {
        return  "Name="+accountHolderName+", \n Type="+accountType+", \n Balance="+accountBalance+", \n Branch="+getBankBranch()+ " \n BANK Name="+getBankName()+ "\n IFSC="+getBankIfsc()  ;
    }

}
