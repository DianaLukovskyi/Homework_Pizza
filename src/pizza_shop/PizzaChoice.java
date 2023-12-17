package pizza_shop;

public class PizzaChoice {
    Object createPizza(String type) {
        switch (type) {
            case "1":
                return new PizzaPepperoni();
            case "2":
                return new PizzaMargarita();
            case "3":
                return new PizzaHawaii();
            default:
                return null;
        }


    }
}
