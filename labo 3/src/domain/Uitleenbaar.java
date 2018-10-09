package domain;

public class Uitleenbaar implements State {
    private PartyItem item;
    public Uitleenbaar(PartyItem item){
        this.item = item;
    }
    @Override
    public void leenUit() {
        System.out.println("Je leent een boek uit.");
        item.changeState(item.getStateUitgeleend());
    }

    @Override
    public void brengTerug() {
        throw new IllegalStateException("Item kan niet terug gebracht worden als het niet uitgeleend is.");
    }

    @Override
    public void verwijder() {
        item.changeState(item.getVerwijderd());
    }

    @Override
    public void herstel() {
        item.changeState(item.getBeschadigd());
    }

    public String toString(){
        return "Uitleenbaar.";
    }



}
