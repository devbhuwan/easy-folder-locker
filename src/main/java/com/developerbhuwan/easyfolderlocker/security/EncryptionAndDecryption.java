package com.developerbhuwan.easyfolderlocker.security;



import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;

/**
 *
 * @author Bhuwan Upadhyay
 */
public class EncryptionAndDecryption {

    public static byte[] encrypt(String value) {
        byte[] encrypted = null;
        try {

            byte[] raw = new byte[]{'T', 'h', 'i', 's', 'I', 's', 'A', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y'};
            Key skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] iv = new byte[cipher.getBlockSize()];

            IvParameterSpec ivParams = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, ivParams);
            encrypted = cipher.doFinal(value.getBytes());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return encrypted;
    }

    public static String decrypt(byte[] encrypted) {
        byte[] original = null;
        Cipher cipher = null;
        try {
            byte[] raw = new byte[]{'T', 'h', 'i', 's', 'I', 's', 'A', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y'};
            Key key = new SecretKeySpec(raw, "AES");
            cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            byte[] ivByte = new byte[cipher.getBlockSize()];
            IvParameterSpec ivParamsSpec = new IvParameterSpec(ivByte);
            cipher.init(Cipher.DECRYPT_MODE, key, ivParamsSpec);
            original = cipher.doFinal(encrypted);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return new String(original);
    }
}
