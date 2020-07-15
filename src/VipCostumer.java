public class VipCostumer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCostumer() {
        this("John", 5000, "john@email.com");

    }

    public VipCostumer(String name, double creditLimit) {
        this(name, creditLimit, "john@email.com");
    }

    public VipCostumer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
