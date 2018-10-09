package domain;

public class Beschadigd implements State {
    private PartyItem partyItem;

    public Beschadigd(PartyItem item) {
        this.partyItem = item;
    }

    @Override
    public void leenUit() {
        throw new IllegalStateException("Kan item niet uitlenen wanneer het niet beschikbaar is.");
    }

    @Override
    public void brengTerug() {
        throw new IllegalStateException("Kan item niet terugbrengen als het al is teruggebracht");
    }

    @Override
    public void verwijder() {
        partyItem.changeState(partyItem.getVerwijderd());
    }

    @Override
    public void herstel() {
        partyItem.changeState(partyItem.getStateUitleenbaar());
    }
}
