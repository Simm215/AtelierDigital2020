package visitor;

public class Main {
    public static void main(String[] args) {
        Element[] element = Element[4];
        Book book = new Book (10,3);
        Book book2 = new Book (100,4);
        Video video = new Video (23,3);
        Audio audio = new Audio(23,3);

        element[0] = book;
        element[1] = book2;
        element[2]= video;
        element[3]=audio;
        Visitor visitor = new CostVisitor();

        visitor.visit(element);
        System.out.println(((CostVisitor) visitor).getTotalCost()); //cast ca sa putem apela metoda din subclasa

    }
}
