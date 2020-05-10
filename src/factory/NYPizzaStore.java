package factory;

public class NYPizzaStore extends PizzaFactory {
    public Pizza createPizza (String type) {
        Pizza pizza = null;

        if(type.equals("Spicy")){
            pizza = new NYSpicyPizza();
        }
        else
            if (type.equals("Chees")){
                pizza = new NYCheesPizza();
            }

        return pizza;
    }
}
