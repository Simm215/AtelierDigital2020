package decorator;

public class Beverage {
    private String description;
    private int cost;

    public Beverage(String description, int cost){
        this.description = description;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public Beverage(int cost) {
        this.cost = cost;
    }
}
