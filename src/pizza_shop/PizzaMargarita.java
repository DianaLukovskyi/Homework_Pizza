package pizza_shop;

public class PizzaMargarita extends Pizza {


    @Override
    void tomato() {
        System.out.println("Preparing pizza Margarita with Tomato souse");
    }

    @Override
    void cheese() {
        System.out.println("Preparing pizza Margarita with cheese");
    }

    @Override
    void bake() {
        System.out.println("Baking pizza Margarita with cheese");
    }

    void pack() {
        System.out.println("Packing pizza Margarita");
    }
}
