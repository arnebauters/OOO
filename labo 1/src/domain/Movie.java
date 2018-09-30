package domain;

public class Movie extends Product {
    public Movie(String title, int id, String type) {
        super(title, id, type);
    }

    public double getPrice(int days){
        double price = 5;
        int daysLeft = days - 3;
        if (daysLeft > 0) {
            price += (daysLeft * 2);
        }
        return price;
    }

    public String toString(){
        return super.toString() + "\ntype: Movie";
    }
}
