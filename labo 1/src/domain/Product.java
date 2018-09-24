package domain;

public abstract class Product {
    private String id,title,type;

    public Product(String id, String title, String type){
        this.id = id;
        this.title = title;
        this.type = type;
    }

}
