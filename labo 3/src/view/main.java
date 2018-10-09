package view;

import domain.PartyItem;

public class main {

    public static void main(String [] args){
        PartyItem item = new PartyItem("tent", 100);
        System.out.println(item.printState());
        item.leenuit();
        System.out.println(item.printState());
        item.brengterug();
        System.out.println(item.printState());
        System.out.println(item.getPrijslenen());
    }
}
