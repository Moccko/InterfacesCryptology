/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.iut;

/**
 *
 * @author abouyssou
 */
public class Caesar {

    static String caesarEncrypt(String message, int offset) {
        StringBuilder messageFinal = new StringBuilder();
        char[] messageArray = message.toCharArray();
        for (char character : messageArray) {
            messageFinal.append(caesarEncryptLetter(character, (char) (offset % 26 + 96)));
        }
        return messageFinal.toString();
    }

    static String caesarDecrypt(String message, int offset) {
        StringBuilder messageFinal = new StringBuilder();
        char[] messageArray = message.toCharArray();
        for (char character : messageArray) {
            messageFinal.append(caesarDecryptLetter(character, (char) (offset % 26 + 96)));
        }
        return messageFinal.toString();
    }

    static char caesarEncryptLetter(char letter, char offset) {
        if (offset == 'z') {
            return letter;
        } else if (letter + offset - 96 > 'z') {
            return (char) (letter + offset - 122);
        } else {
            return (char) (letter + offset - 96);
        }
    }

    static char caesarDecryptLetter(char letter, char offset) {
        if (offset == 'z') {
            return letter;
        } else if (letter - offset + 96 < 'a') {
            return (char) (letter - offset + 122);
        } else {
            return (char) (letter - offset + 96);
        }
    }
}
