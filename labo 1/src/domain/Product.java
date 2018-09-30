package domain;

public abstract class Product implements Comparable{
    private String title, type;
    private int id;


    public Product(String title, int id, String type) {
        setId(id);
        setTitle(title);
        setType(type);
    }

    public abstract double getPrice(int days);

    public int getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    private void setId(int id) {
        if (id <= 0) {
            throw new DomainException("Id mag niet negatief of nul zijn.");
        }
        this.id = id;
    }

    private void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new DomainException("titel mag niet leeg zijn.");
        }
        this.title = title;
    }

    public void setType(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new DomainException("type mag niet leeg zijn.");
        }
        this.type = type;
    }

    public String toString(){
        return "Titel: "+this.title + "\n" + "ID: " + this.id;
    }

    public int compareTo(Product product){
       if()
    }
}
