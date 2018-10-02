package view;

import domain.Caesar;
import domain.Text;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int keuze = Integer.parseInt(JOptionPane.showInputDialog(null, "Kies een algoritme:\n1) Caesar\n2) Mirror\n\n0) Quit"));
        while (keuze != 0) {
            if (keuze == 1) {
                try {
                    String tekst = JOptionPane.showInputDialog("Geef je tekst in.");
                    int key = Integer.parseInt(JOptionPane.showInputDialog("Geef je key in."));
                    Text text = new Text(tekst);
                    Caesar cr = new Caesar(key);
                    text.changeEncryptor(cr);
                    int choice = Integer.parseInt(JOptionPane.showInputDialog("1: Encypteren\n2: Decrypteren"));
                    if (choice == 1) {
                        JOptionPane.showMessageDialog(null, text.encrypt());
                    } else {
                        JOptionPane.showMessageDialog(null, text.decrypt());
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Geef een getal in");
                }
            } else if (keuze == 2) {
                try {
                    String tekst = JOptionPane.showInputDialog("Geef je tekst in.");
                    Text text = new Text(tekst);
                    int choice = Integer.parseInt(JOptionPane.showInputDialog("1: Encypteren\n2: Decrypteren"));
                    if (choice == 1) {
                        JOptionPane.showMessageDialog(null, text.encrypt());
                    } else {
                        JOptionPane.showMessageDialog(null, text.decrypt());
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Geef een getal in");
                }
            }
        }
    }
}
