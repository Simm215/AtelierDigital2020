package factory;

public class Main {

    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new NYPizzaStore();

        Pizza p1 = pizzaFactory.orderPizza("Chees");
        Pizza p2 = pizzaFactory.orderPizza("Spicy");

        System.out.println(p1);
        System.out.println(p2);
    }
}

