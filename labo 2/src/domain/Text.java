package domain;

import domain.Encryptor;
import domain.Mirror;

public class Text {
    private String text;
    private Encryptor encr;
    public Text(String text){
        this.text = text;
        this.encr = new Mirror();
    }

    public String encrypt(){
        return this.encr.encrypt(text);
    }
    public String decrypt(){
        return this.encr.decrypt(text);
    }

    public void changeEncryptor(Encryptor encryptor){
        this.encr = encryptor;
    }
}
