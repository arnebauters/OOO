package view;

import domain.*;

import javax.swing.*;

public class UI {
    public static void main(String [] args){
        Shop shop = new Shop();
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n\n0. Quit";
        int choice = -1;
        while (choice != 0) {
            String choiceString = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceString);
            if (choice == 1) {
                String title = JOptionPane.showInputDialog("Enter the title:");
                String id = JOptionPane.showInputDialog("Enter the id:");
                String type = JOptionPane.showInputDialog("Enter the type (M for movie/G for game):");
                Product product = null;
                if(type.equals('M')) {
                     product = new Movie(title, id, type);
                } else {
                     product = new Game(title, id, type);
                }
                shop.addProduct(product);
            } else if (choice == 2) {
                String id = JOptionPane.showInputDialog("Enter the id:");
                JOptionPane.showMessageDialog(null, shop.showProduct(id));
            } else if (choice == 3){
                String id = JOptionPane.showInputDialog("Enter the id:");
                String daysString = JOptionPane.showInputDialog("Enter the number of days:");
                int days = Integer.parseInt(daysString);
                JOptionPane.showMessageDialog(null, shop.showPrice(id,days));
            }
        }
    }
    }
