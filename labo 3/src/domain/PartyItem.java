package domain;

public class PartyItem {
    private int price;
    private String name;
    private State currentState;
    private Uitleenbaar uitleenbaar;
    private Uitgeleend uitgeleend;
    private Beschadigd beschadigd;
    private Verwijderd verwijderd;
    private boolean beschadiging;
    private static double prijslenen;


    public PartyItem(String n, int p) {
        setPrice(p);
        setName(n);
        setInitalState(new Uitleenbaar(this));
        uitleenbaar = new Uitleenbaar(this);
        uitgeleend = new Uitgeleend(this);
        beschadigd = new Beschadigd(this);
        verwijderd = new Verwijderd(this);
        this.beschadiging = false;
        setPrijsLenen(prijslenen);
    }

    private void setPrijsLenen(double prijslenen) {
        this.prijslenen = this.price * 0.2;
    }

    public double getPrijslenen(){
        return this.prijslenen;
    }

    private void setName(String n) {
        if (n == null || n.trim().isEmpty()) {
            throw new IllegalArgumentException("Naam mag niet leeg zijn.");
        }
        this.name = n;
    }

    private void setPrice(int p) {
        if (p <= 0) {
            throw new IllegalArgumentException("Prijs mag niet kleiner of gelijk aan nul zijn.");
        }
        this.price = p;
    }

    private void setInitalState(Uitleenbaar uitleenbaar) {
        this.currentState = uitleenbaar;
    }

    protected void changeState(State state) {
        this.currentState = state;
    }

    protected State getStateUitgeleend() {
        return this.uitgeleend;
    }

    protected State getStateUitleenbaar() {
        return this.uitleenbaar;
    }

    protected State getBeschadigd() {
        return this.beschadigd;
    }

    protected State getVerwijderd() {
        return this.verwijderd;
    }

    public void leenuit(){
        currentState.leenUit();
    }

    public void verwijder(){
        currentState.verwijder();
    }

    public void brengterug(){
        currentState.brengTerug();
    }

    public void setBeschadigd(){
        currentState.herstel();
    }

    public String printState() {
        return "State: " + this.currentState;
    }

    public void voorwerp_beschadigd(){
        this.beschadiging = true;
    }

    public void voorwerp_hersteld(){
        this.beschadiging = false;
    }

    public boolean getBeschadiging(){
        return this.beschadiging;
    }

    public String getStatus(){
        return this.currentState.toString();
    }
}
