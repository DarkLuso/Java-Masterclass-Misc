public class Burger {

    private String roll = "Bread";
    private String meat;
    private double price;
    private double finalPrice;
    private String name;
    private boolean lettuce = false;
    private boolean drinks = false;
    private boolean mayonnaise = false;
    private boolean chips = false;

    public Burger(String roll, String meat, double price, String name) {

        this.roll = roll;
        this.meat = meat;
        this.price = price;
        this.finalPrice = price;
        this.name = name;
    }

    public void addAdditional (boolean lettuce, boolean drinks, boolean mayonnaise, boolean chips){

            this.lettuce = lettuce;
            if (lettuce)
                this.finalPrice += 1.99;
            this.drinks = drinks;
            if (drinks)
                this.finalPrice += 3.99;
            this.mayonnaise = mayonnaise;
            if (mayonnaise)
                this.finalPrice += 1.99;
            this.chips = chips;
            if (chips)
                this.finalPrice += 3.99;
    }

    public void getPrice (){

        if (lettuce)
            System.out.println("Lettuce: 1.99");
        if (drinks)
            System.out.println("Drinks: 3.99");
        if (mayonnaise)
            System.out.println("Mayonnaise: 1.99");
        if (chips)
            System.out.println("Chips: 3.99");
        System.out.println("Hamburger " + name + ": " + price);
        System.out.println("Final = " + finalPrice);
    }

}
