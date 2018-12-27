package me.nakeeb;

import java.util.Scanner;

public class CesarCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long shiftCount = scanner.nextLong();
        scanner.nextLine();

        String msg = scanner.nextLine();
        String encMsg = "";

        if (shiftCount >= 0 && shiftCount <= 99999999999L){

            for (int i = 0; i < msg.length(); i++){
                int charAscii = (int) msg.charAt(i);
                if (charAscii > 64 && charAscii < 91){
                    charAscii = 65 + ((charAscii - 65 + (int) shiftCount) % 26);
                    encMsg += (char) charAscii;
                }
            }
        }

        System.out.println(encMsg);
    }
}
