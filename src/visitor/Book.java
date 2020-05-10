package visitor;

public class Book implements Element{
    private int nrofPages;
    private int cost;

    public Book(int nrofPages, int cost){
        this.nrofPages = nrofPages;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public int getNrofPages() {
        return nrofPages;
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}
