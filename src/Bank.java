public class Bank {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit (double value, String customerName, String accountNumber){
        if (!customerName.equals(this.customerName) || !accountNumber.equals(this.accountNumber))
            System.out.println("Incorrect data");
        else if (value <= 0)
            System.out.println("Invalid Value");
        else this.balance += value;
    }

    public void withdraw (double value, String customerName, String accountNumber){
        if (!customerName.equals(this.customerName) || !accountNumber.equals(this.accountNumber))
            System.out.println("Incorrect data");
        else if (value >= this.balance)
            System.out.println("Invalid Value");
        else this.balance -= value;
    }

}
