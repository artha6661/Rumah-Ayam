package com.rumahayam.arthabastanta.Security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
@Service
public class AESEncryptionService {

    @Value("${encryption.algorithm}")
    private String algorithm;

    @Value("${encryption.key}")
    private String encryptionKey;

    public String encrypt(String input) throws Exception {
        Key key = new SecretKeySpec(encryptionKey.getBytes(StandardCharsets.UTF_8), algorithm);
        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encryptedBytes = cipher.doFinal(input.getBytes(StandardCharsets.UTF_8));
        return new String(encryptedBytes);
    }

    public String decrypt(String encrypted) throws Exception {

        byte[] encryptedBytes = Base64.getDecoder().decode(encrypted);
        SecretKey secretKey = new SecretKeySpec(encryptionKey.getBytes(StandardCharsets.UTF_8), algorithm);

        Cipher cipher = Cipher.getInstance(algorithm);
        cipher.init(Cipher.DECRYPT_MODE, secretKey);

        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        return new String(decryptedBytes, StandardCharsets.UTF_8);
    }
}
