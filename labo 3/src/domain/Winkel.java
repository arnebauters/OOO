package domain;

import java.util.ArrayList;

public class Winkel {
    private ArrayList<PartyItem> items;
    private String naam;

    public Winkel(String naam){
        setNaam(naam);
        this.items = new ArrayList<>();
    }

    private void setNaam(String naam){
        if (naam == null|| naam.trim().isEmpty()){
            throw new IllegalArgumentException("Naam mag niet leeg zijn.");
        }
        this.naam = naam;
    }

    public void addPartyItem(PartyItem item){
        if (item == null){
            throw new IllegalArgumentException();
        }
        this.items.add(item);
    }

    public void removePartyItem(PartyItem item){
        if (item == null){
            throw new IllegalArgumentException();
        }
        for (PartyItem i: items){
            if (i.equals(item)){
                items.remove(i);
            }
        }
    }
}
