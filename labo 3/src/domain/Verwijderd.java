package domain;

public class Verwijderd implements State {
    private PartyItem partyitem;

    public Verwijderd(PartyItem item){
        this.partyitem = item;
    }
    @Override
    public void leenUit() {
        throw new IllegalStateException("Item is verwijderd.");
    }

    @Override
    public void brengTerug() {
        throw new IllegalStateException("Item is verwijderd.");
    }

    @Override
    public void verwijder() {
        throw new IllegalStateException("Item is verwijderd.");
    }

    @Override
    public void herstel() {
        throw new IllegalStateException("Item is verwijderd.");
    }
}
