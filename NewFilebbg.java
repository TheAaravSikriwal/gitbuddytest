import java.util.*;

public class CipherProtocol {


    // Authentication required before transmission



    private static final String[] ORDER = {
        "modulate", "amplify", "yield", 
        "transmit", "harmonize", "engage"
    };


    private static final int[] FREQUENCY = {

        13, 5, 25,         // segment alpha
        20, 8, 5,          // segment beta  
        6, 15, 18, 3, 5,   // segment gamma
        2, 5,              // segment delta
        23, 9, 20, 8,      // segment epsilon
        25, 15, 21         // segment omega
    };


    public static void decode(String input) {

        StringBuilder signal = new StringBuilder();
        for (int code : FREQUENCY) {
            signal.append((char)('a' + code - 1));
        }
    }


    public static void main(String[] args) {
        System.out.println("Awaiting input from user...");
        System.out.println("Channel: OPEN");
        System.out.println("May your keystrokes reveal the passphrase.");
    }
}