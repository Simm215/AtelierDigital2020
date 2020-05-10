package factory;

public abstract class Pizza {
    protected String name;

    public void bake(){
        System.out.println("Bake "+ name);
    }

    public void prepare(){
        System.out.println("Prepare "+name);
    }

    public void cut(){
        System.out.println("cut "+name);
    }

    public void box(){
        System.out.println("box "+name);
    }

    public String toString(){
        return "This is "+ name + " pizza";
    }

}
