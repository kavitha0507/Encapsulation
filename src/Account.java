// Java program to demonstrate the Encapsulation.
public class Account {
    private long acc_no;
    private String name,email;
    private double amount;
    // To Access the private we have to set the getter and setter methods.
    public long getAcc_no() {
        return acc_no;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {

        this.amount = amount;
    }
    }

