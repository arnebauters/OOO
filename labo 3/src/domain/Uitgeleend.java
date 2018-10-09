package domain;

public class Uitgeleend implements State {
    private PartyItem item;

    public Uitgeleend(PartyItem i) {
        this.item = i;
    }

    @Override
    public void leenUit() {
        throw new IllegalStateException("Item kan niet terug uitgeleend worden als het al uitgeleend is.");
    }

    @Override
    public void brengTerug() {
        boolean beschadigd = item.getBeschadiging();
        if(beschadigd == false){
            System.out.println("Je brengt het item terug.");
            item.changeState(item.getStateUitleenbaar());
        }
        else {
            System.out.println("Je item is beschadigt.");
            item.changeState(item.getBeschadigd());
        }
    }

    @Override
    public void verwijder() {
        throw new IllegalStateException("Item kan niet verwijderd worden als het al uitgeleend is.");
    }

    @Override
    public void herstel() {
        throw new IllegalStateException("Item kan niet terug hersteld worden als het al uitgeleend is.");
    }

    @Override
    public String toString() {
        return "Uitgeleend";
    }
}
