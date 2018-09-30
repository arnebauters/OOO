package domain;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> products;

    public Shop() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product p) {
        this.products.add(p);
    }

    public String showProduct(int id) {
        String title = "";
        for (Product p : products) {
            if (p.getId() == id) {
                title = p.getTitle();
            }
        }
        return title;
    }

    public double showPrice(int id, int days) {
        for (Product p : products) {
            if (p.getId() == id) {
                return p.getPrice(days);
            }
        }
        return 0;
    }

    public int getId(){
        int id = 1;
        if (products.size() == 0){
            return id;
        }
        else{
            int index = products.size() - 1;
            Product product = products.get(index);
            id = product.getId() + 1;
            return id;
        }
    }

    public String showProducts(){
        String result = "";
        for(Product p: this.products){
            result += p.toString() + "\n----------------\n";
        }
        return result;
    }
}

