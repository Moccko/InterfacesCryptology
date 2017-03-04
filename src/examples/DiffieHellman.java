package examples;

import java.math.BigInteger;
import java.util.Random;

class DiffieHellman {

    private static final BigInteger P = new BigInteger(512, 100, new Random());
    private static final BigInteger G = new BigInteger(512, 100, new Random());
    private final BigInteger alice;
    private final BigInteger bob;

    DiffieHellman(String alice, String bob) {
        this.alice = new BigInteger(alice);
        this.bob = new BigInteger(bob);
    }

    private BigInteger alice() {
        return G.modPow(bob, P);
    }

    private BigInteger bob() {
        return G.modPow(alice, P);
    }

    private BigInteger alice2() {
        return alice().modPow(alice, P);
    }

    private BigInteger bob2() {
        return bob().modPow(bob, P);
    }

    public String getSignature() {
        if (alice2().equals(bob2())) {
            return alice2().toString();
        } else {
            return "Bad input entered";
        }
    }

    public static String generateNumber() {
        return new BigInteger(512, 100, new Random()).toString();
    }
}
