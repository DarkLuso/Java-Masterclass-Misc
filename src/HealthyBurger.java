public class HealthyBurger extends Burger{

    private boolean greenMayonnaise = false;
    private boolean mustard = false;


    public HealthyBurger(String meat, double price) {
        super("Brown rye", meat, price, "Healthy Burger");

    }


    public void addAdditional(boolean lettuce, boolean drinks, boolean mayonnaise, boolean chips,
    boolean greenMayonnaise, boolean mustard) {
        super.addAdditional(lettuce, drinks, mayonnaise, chips);
        this.greenMayonnaise = greenMayonnaise;
        this.mustard = mustard;
    }

    @Override
    public void getPrice() {
        if (greenMayonnaise)
            System.out.println("Green Mayonnaise: 1.99");
        if (mustard)
            System.out.println("Mustard: 1.99");
        super.getPrice();
    }
}
