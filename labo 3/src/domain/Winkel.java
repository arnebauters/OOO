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

    public double rent(PartyItem item){
        if (item == null){
            throw new IllegalArgumentException();
        }
        if (item.getStatus().equals("Uitleenbaar") ){
            item.leenuit();
            return item.getPrijslenen();
        }
        else{
            throw new IllegalStateException();
        }
    }

    public void brengTerug(PartyItem item){
        if (item == null){
            throw new IllegalArgumentException();
        }
        if (item.getStatus().equals("Uitgeleend") ){
            item.brengterug();
            if(item.getBeschadiging() == true){
                toonKost(item);
            }
            else{
                item.brengterug();
            }
        }else{
            throw new IllegalStateException();
        }
    }

    private void toonKost(PartyItem item) {
    }

    public void setBeschadiging(PartyItem item) {
        item.voorwerp_beschadigd();
    }
    public void setHersteld(PartyItem item) {
        item.voorwerp_hersteld();
    }
}
