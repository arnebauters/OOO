package domain;

import domain.Encryptor;

public class Mirror implements Encryptor {
    public Mirror() {

    }

    @Override
    public String encrypt(String t) {
        byte[] strAsByteArray = t.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }

        return new String(result);
    }

    @Override
    public String decrypt(String t) {
        byte[] strAsByteArray = t.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }

        return new String(result);
    }
}
