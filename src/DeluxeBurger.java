public class DeluxeBurger extends Burger{

    private boolean isDeluxe = true;

    public DeluxeBurger() {
        super("Mandioca", "Cordeiro", 12.99, "Deluxe Burger");
    }

    @Override
    public void addAdditional(boolean lettuce, boolean drinks, boolean mayonnaise, boolean chips) {
        super.addAdditional(false, true, false, true);
        System.out.println("You can't do This");
    }
}
