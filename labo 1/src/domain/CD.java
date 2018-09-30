package domain;

public class CD extends Product {
    public CD(String title, int id, String type) {
        super(title, id, type);
    }

    @Override
    public double getPrice(int days) {
        return 1.5*days;
    }
    public String toString(){
        return super.toString() + "\ntype: CD";
    }
}
