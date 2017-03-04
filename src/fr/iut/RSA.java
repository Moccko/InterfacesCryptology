package fr.iut;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

class RSA {

    private static Scanner scanner = new Scanner(System.in);
    private String input = "";

    RSA() {
        System.out.println("Keys generation");
        /* HashMap<Character, BigInteger> cypher = generateKeys(512);
         try {
         PrintWriter writer = new PrintWriter("rsa.pub", "UTF-8");
         writer.println(cypher.get('e').toString() + "," + cypher.get('n').toString());
         writer.close();
         System.out.println("Public key generated in rsa.pub");
         writer = new PrintWriter("rsa.pri", "UTF-8");
         writer.println(cypher.get('d').toString());
         writer.close();
         System.out.println("Private key generated in rsa.pri");
         } catch (IOException e) {
         System.err.println("Exception : " + e);
         }
         System.out.println("Keys generated");
         */
        do {
            System.out.println("Would you like to encrypt or decrypt a message ? (e/d) Press q to quit");
            input = scanner.nextLine();
            String message;
            switch (input.charAt(0)) {
                case 'e':
                    System.out.println("Enter your message :");
                    message = scanner.nextLine();
//                    System.out.println(RSAEncrypt(message));
                    break;
                case 'd':
                    System.out.println("Enter the message to decode : ");
                    message = scanner.nextLine();
                    System.out.println("Enter the name of the public key file (default : rsa.pub) : ");
                    System.out.println(RSADecrypt(message));
                    break;
                case 'q':
                    return;
                default:
                    System.out.println("Wrong character");
                    break;
            }
        } while (!input.equals("q"));
    }

    static public boolean generateKeys(int bits) {
        BigInteger p, q, n, phi, e, d;
        p = new BigInteger(bits, 75, new Random());
        q = new BigInteger(bits, 75, new Random());
        n = p.multiply(q);
        BigInteger p1 = p.subtract(BigInteger.ONE);
        BigInteger q1 = q.subtract(BigInteger.ONE);
        phi = p1.multiply(q1);
        e = new BigInteger(phi.bitLength(), 75, new Random());
        d = e.modInverse(phi);
        try {
            PrintWriter writer = new PrintWriter("rsa.pub", "UTF-8");
            writer.println(e.toString() + "," + n.toString());
            writer.close();
            System.out.println("Public key generated in rsa.pub");
            writer = new PrintWriter("rsa.pri", "UTF-8");
            writer.println(d.toString());
            writer.close();
            System.out.println("Private key generated in rsa.pri");
        } catch (IOException ioe) {
            System.err.println("Exception : " + ioe);
            return false;
        }
        System.out.println("Keys generated");

        return true;
    }

    /**
     * String utility to convert a string to an ASCII string Inspired from :
     * http://javarevisited.blogspot.com/2015/07/how-to-convert-string-or-char-to-ascii-example.html#ixzz4YUEgQ08D
     *
     * @param str : the String to convert
     * @return : String
     */
    public String toAscii(String str) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        char[] letters = str.toCharArray();
        for (char ch : letters) {
            sb.append((byte) ch);
        }
        return sb.toString();
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            int ascii = str.indexOf(i) * 10 + str.indexOf(i + 1);
            sb.append((char) ascii);
        }
        return sb.toString();
    }

    static public String RSAEncrypt(String messageString, String publicKey) {
        byte[] message = messageString.getBytes();
        BigInteger encodedMessage = new BigInteger(message);
//        Path publicKeyFile = Paths.get("rsa.pub");
//        Charset charset = Charset.forName("UTF-8");
//        try {
//            BufferedReader br = Files.newBufferedReader(publicKeyFile, charset);
//            String publicKey = br.readLine();
//            br.close();
            String[] publicKeys = publicKey.split(",");
            BigInteger e, n;
            e = new BigInteger(publicKeys[0]);
            n = new BigInteger(publicKeys[1]);
            encodedMessage = encodedMessage.modPow(e, n);
//        } catch (IOException ioe) {
//            System.err.println("Error " + ioe);
//        }
        return encodedMessage.toString();
    }

    static public String RSADecrypt(String encodedMessage) {
        BigInteger privateKey, encoded;
        String publicKey;
        byte[] message;
        Charset charset = Charset.forName("UTF-8");
        Path publicFile = Paths.get("rsa.pub");
        Path privateFile = Paths.get("rsa.pri");
        try {
            BufferedReader br = Files.newBufferedReader(publicFile, charset);
            publicKey = br.readLine();
            br.close();
            String[] publicKeys = publicKey.split(",");
            br = Files.newBufferedReader(privateFile, charset);
            privateKey = new BigInteger(br.readLine());
            br.close();
            encoded = new BigInteger(encodedMessage);
            message = (encoded.modPow(privateKey, new BigInteger(publicKeys[1]))).toByteArray();
            return new String(message);
        } catch (IOException ioe) {
            return "Erreur de lecture " + ioe;
        }
    }
}
