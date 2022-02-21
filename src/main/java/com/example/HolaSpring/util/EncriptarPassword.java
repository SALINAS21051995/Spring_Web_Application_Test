package com.example.HolaSpring.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author user
 */
public class EncriptarPassword {
    public static void main(String[] args){
        System.out.println("password: " + encriptarPassword("123"));
    }

    public static String encriptarPassword(String pass){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(pass);
    }
}
