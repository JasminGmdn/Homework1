package Task3;

public class Computer {
    private String name;
    private static int amount = 0;



    private Computer(String name){
            this.name = name;

    }

    public static Computer createComp(String name){
        amount++;
        return new Computer(name);
    }

    public static int getAmount(){
        return amount;
    }

    public String toString(){
        return "Computer" + amount;
    }

}
