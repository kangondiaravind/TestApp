package test.com.ling.model;

public class Bank {

    private String BankName;
    private String BankBranch;
    private String BankIfsc;

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String bankName) {
        BankName = bankName;
    }

    public String getBankBranch() {
        return BankBranch;
    }

    public void setBankBranch(String bankBranch) {
        BankBranch = bankBranch;
    }

    public String getBankIfsc() {
        return BankIfsc;
    }

    public void setBankIfsc(String bankIfsc) {
        BankIfsc = bankIfsc;
    }
}
