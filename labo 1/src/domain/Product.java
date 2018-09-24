package domain;

public abstract class Product {
    private String id,title,type;

    public Product(String title, String id, String type){
        this.id = id;
        this.title = title;
        this.type = type;
    }

    public abstract double getPrice(int days);

    public String getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }
}
