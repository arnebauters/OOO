package domain;

public class Game extends Product {

    public Game(String title, int id, String type) {
        super(title, id, type);
    }

    public double getPrice(int days) {
        return days * 3;
    }
    public String toString(){
        return super.toString() + "\ntype: Game";
    }
}
