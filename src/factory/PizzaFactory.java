package factory;

public abstract class PizzaFactory {

    public abstract Pizza createPizza(String type) ;

    public Pizza orderPizza(String type){
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake(); //partile abstracte nu se schimba, ci doar cele concrete
        pizza.cut();
        pizza.box();

        return pizza;

    }
}
