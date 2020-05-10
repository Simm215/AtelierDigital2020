package decorator;

public class Main {
    public static void main(String[] args) {
          Beverage dr = new DarkRoast();
          Beverage drw = new Whip(dr);

          Beverage hb = new HouseBlend(); //prima data clasa de baza si adaugam peste ea
          hb = new Mocha(hb);
          hb = new Whip(hb);

          System.out.println(drw.getDescription() + "cost = " + drw.getCost());
          System.out.println(dr.getDescription() + "cost= " + dr.getCost());
          System.out.println(hb.getDescription() + "cost = "+ hb.getCost());
    }
}
