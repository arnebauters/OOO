package view;

import domain.*;

import javax.swing.*;

public class UI {
    public static void main(String[] args) {
        Shop shop = new Shop();
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n4.list all Products in the shop\n\n0. Quit";
        int choice = -1;
        boolean quite = false;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            if (choice == 1) {
                boolean error = false;
                while (!error) {
                    String title = JOptionPane.showInputDialog("Enter the title:");
                    String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game/CD for cd):");
                    int id = shop.getId();
                    Product product = null;
                    try {
                        if (type.equals("M")) {
                            product = new Movie(title, id, type);
                            error = true;
                        } else if (type.equals("G")) {
                            product = new Game(title, id, type);
                            error = true;
                        } else if (type.equals("CD")) {
                            product = new CD(title, id, type);
                            error = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Je gaf een verkeerde waarde in");

                        }
                        shop.addProduct(product);
                    } catch (DomainException e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                        error = false;
                    }
                }

            } else if (choice == 2) {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the id:"));
                JOptionPane.showMessageDialog(null, shop.showProduct(id));
            } else if (choice == 3) {
                int id = Integer.parseInt(JOptionPane.showInputDialog("Enter the id:"));
                int days = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of days:"));
                JOptionPane.showMessageDialog(null, shop.showPrice(id, days));
            }else if (choice == 4) {
                JOptionPane.showMessageDialog(null, shop.showProducts());
            }
        }
    }
}
