package visitor;
/* pt git:
-git status
-git add.
-git status sa vedem daca s-au adaugat
-git commit -m "lab4"
-git status

 */

public class Video implements Element {
    private int time;
    private int cost;

    public Video (int time, int cost){
        this.time = time;
        this.cost = cost;
    }
    public int getTime() {
        return time;
    }

    public int getCost() {
        return cost;
    }

    public void accept(Visitor v){
        v.visit(this);
    }
}
