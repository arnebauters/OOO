package domain;

public class Caesar implements Encryptor {
    private int key;
    public Caesar(int key){
        this.key = key;
    }


    @Override
    public String encrypt(String t) {
        String s = "";
        int len = t.length();
        for(int x = 0; x < len; x++){
            char c = (char)(t.charAt(x) + key);
            if (c > 'z')
                s += (char)(t.charAt(x) - (26-key));
            else
                s += (char)(t.charAt(x) + key);
        }
        return s;
    }

    @Override
    public String decrypt(String t) {
        String decryptedMessage = "";
        char ch;
        for(int i = 0; i < t.length(); ++i){
            ch = t.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch - key);

                if(ch < 'a'){
                    ch = (char)(ch + 'z' - 'a' + 1);
                }

                 decryptedMessage += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch - key);

                if(ch < 'A'){
                    ch = (char)(ch + 'Z' - 'A' + 1);
                }

                decryptedMessage += ch;
            }
            else {
                decryptedMessage += ch;
            }
        }

        return decryptedMessage;

    }
}
