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

    public String showProduct(String id) {
        String title = "";
        for (Product p : products) {
            if (p.getId().equals(id)) {
                title = p.getTitle();
            }
        }
        return title;
    }

    public double showPrice(String id, int days) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                return p.getPrice(days);
            }
        }
        return 0;

    }
}

