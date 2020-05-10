package decorator;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage){
        super("Mocha",2,beverage);
    }
}
