/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.iut;

/**
 *
 * @author rrieunier
 */
public class Vigenere {

    static String makeKey(String key, int size) {
        StringBuilder finalKey = new StringBuilder();
        for (int i = 0; i < size; i++) {
            finalKey.append(key.charAt(i % key.length()));
        }
        System.out.println(finalKey.toString());
        return finalKey.toString();
    }

    static String vigenereEncrypt(String message, String key) {
        String messageToLower = message.toLowerCase();
        System.out.println(messageToLower);
        StringBuilder vigenereMessage = new StringBuilder();
        String vigenereKey = makeKey(key, messageToLower.length());
        for (int i = 0; i < messageToLower.length(); i++) {
            char letter = Caesar.caesarEncryptLetter(messageToLower.charAt(i), vigenereKey.charAt(i));
            vigenereMessage.append(letter);
        }
        return vigenereMessage.toString();
    }

    static String vigenereDecrypt(String message, String key) {
        String messageToLower = message.toLowerCase();
        System.out.println(messageToLower);
        StringBuilder vigenereMessage = new StringBuilder();
        String vigenereKey = makeKey(key, messageToLower.length());
        for (int i = 0; i < messageToLower.length(); i++) {
            char letter = Caesar.caesarDecryptLetter(messageToLower.charAt(i), vigenereKey.charAt(i));
            vigenereMessage.append(letter);
        }
        return vigenereMessage.toString();
    }

}
