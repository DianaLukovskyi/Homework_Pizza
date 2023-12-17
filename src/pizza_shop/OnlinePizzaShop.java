package pizza_shop;

import java.util.Locale;
import java.util.Scanner;

public class OnlinePizzaShop {
    /* создать магазин/фабрику по продаже и производству пиццы. Программа должна уметь готовить следующие виды пиццы:
    Гавайи, Маргарита, Салями.
    Каждый вид пиццы должен уметь: подготавливаться( накладывать ингридиенты напр), печься и упаковываться.
    В каждом случае должно быть понятно о какой пицце идет речь
    В классе OnlinePizzaShop  не должен создаваться новый обьект пицца, а из него должен поступать  "заказ" на изготовление
    требуемого вида пиццы (обьекта) в класс PizzaChoice, который и должен выбрать нужную пиццу для изготовления

    Выбор пиццы осуществляется клиентом с клавиатуры в классе OnlinePizzaShop, при этом нужно обеспечить проверку
    правильности выбора клиента и возможность заказать еще пиццу/пиццы
1. Классы :
       Pizza - родительский класс
       PizzaSalami, PizzaMargarita, PizzaHawaii  -  дочерние

       В этих классах должны быть минимум три метода, отражающие процесс приготовления пиццы из ТЗ
       prepare()
       bake()
       pack()
       orderPizza()

       PizzaChoice -  сюда в соответствующий метод  будет передаваться выбор клиента и в зависимости от этого выбора
        через switch возвращаться новый обьект соответствующей пиццы
        Pizza createPizza( String type)
Последовательность действий при заказе :

        Введите название пиццы ( 1,2,3)

        Preparing pizza with mozarella cheese
        Baking Pizza Margarita
        Packing Pizza margarita
         В методе main  через сканер предложить клиенту выбрать пиццу. Затем его выбор передать  передать
         в switch, находящийся в методе choosePizza */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaChoice pizzaChoice = new PizzaChoice();

        while (true) {
            System.out.println("Select your pizza : (1 - Pepperoni, 2- Margarita, 3 -Hawaiian ): ");
            String choice = scanner.nextLine();
            Pizza pizza = (Pizza) pizzaChoice.createPizza(choice);
            if (pizza != null) {
                pizza.orderPizza();
            } else {
                System.out.println("Selected incorrect order , please try again");
            }
            System.out.println("Do you want place your order again ? YEAS / NO ");
            String orderMore = scanner.nextLine();
            if (!orderMore.equalsIgnoreCase("YEAS")) {
                break;
            }


        }
        scanner.close();

    }
}
