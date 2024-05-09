package UTS.soal2;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static boolean anagramChecker(String input1, String input2) {
        if (input1.isEmpty()) {
            return false;
        }
        if (input2.isEmpty()) {
            return false;
        }
        HashMap<Character, Integer> letters1 = new HashMap<>();

        for (int i = 0; i < input1.length(); i++) {
            if (!letters1.containsKey(input1.charAt(i))) {
                letters1.put(input1.charAt(i), 1);
            } else {
                letters1.put(input1.charAt(i), letters1.get(input1.charAt(i)) + 1);
            }
        }

        HashMap<Character, Integer> letters2 = new HashMap<>();
        for (int i = 0; i < input2.length(); i++) {
            if (!letters2.containsKey(input2.charAt(i))) {
                letters2.put(input2.charAt(i), 1);
            } else {
                letters2.put(input2.charAt(i), letters2.get(input2.charAt(i)) + 1);
            }
        }

        return letters1.equals(letters2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many anagram check: ");
        int many = in.nextInt();
        for (int i = 0; i < many; i++) {
        System.out.print("First Word: ");
        String firstWord = in.next();
        System.out.print("Second Word: ");
        String secondWord = in.next();
        System.out.println(anagramChecker(firstWord, secondWord));
        }
    }
}
