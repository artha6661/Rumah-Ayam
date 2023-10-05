package com.rumahayam.arthabastanta.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rumahayam.arthabastanta.Security.AESEncryptionService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class MainController {
    @Autowired
    private AESEncryptionService encryptionService;

    @PostMapping("/encrypt")
    public String encryptData(@RequestBody String data) throws Exception {
        String encrypt = encryptionService.encrypt(data);
        return encrypt;
    }

    @PostMapping("/decrypt")
    public String decryptData(@RequestBody String encryptedData) throws Exception {
        return encryptionService.decrypt(encryptedData);
    }
}
