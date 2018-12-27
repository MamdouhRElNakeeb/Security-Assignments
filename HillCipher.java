package me.nakeeb;

import java.util.Scanner;

public class HillCipher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String keyLine = scanner.nextLine();
        String message = scanner.nextLine();
        scanner.close();

        long [] keys = new long[length];

        String[] stringArray = keyLine.split(" ");

        for (int i = 0; i < length; i++) {
            String numberAsString = stringArray[i];
            keys[i] = Integer.parseInt(numberAsString);
        }

        System.out.println(hillCipher(message, keys, length));
    }

    private static String hillCipher(String message, long[] keys, int length){

        long [][] keyMatrix = getKeyMatrix(keys, length);
        long dim = (long) Math.sqrt(length);

        return encrypt(message, dim, keyMatrix);
    }

    private static long[] multiplyMatrices(long [][] x, long [] y, long dim){

        long[] cipherMatrix = new long[(int) dim];

        for (int i = 0; i < dim; i++){
            cipherMatrix[i] = 0;
        }

        for (int i = 0; i < dim; i++){
            for (int j = 0; j < dim; j++){
                cipherMatrix[i] += x[i][j] * y[j];
            }
            cipherMatrix[i] = cipherMatrix[i] % 26;
        }

        return cipherMatrix;

    }

    private static String encrypt(String text, long dim, long[][] keyMatrix) {

        String encrypted = "";
        long [] vectors = new long[(int) dim];
        long rounds = (long) Math.ceil((double) text.length() / (double) dim);

        while (text.length() % dim != 0){
            text += 'X';
        }

        for (int i = 0; i < rounds; i++){
            for (int j = 0; j < dim; j++){
                vectors[j] = ((long) text.charAt(i * (int) dim + j)) - 65;
            }

            long [] cipherMatrix = multiplyMatrices(keyMatrix, vectors, dim);

            for (int j = 0; j < dim; j++){
                encrypted += (char) (cipherMatrix[j] + 65);
            }
        }

        return encrypted;

    }

    private static long[][] getKeyMatrix(long[] keys, int length) {

        int k = 0;
        int dim = (int) Math.sqrt(length);

        long keyMatrix [][] = new long[dim][dim];

        for (int i = 0; i < dim; i++){
            for (int j = 0; j < dim; j++){
                keyMatrix[i][j] = keys[k];
                k++;
            }
        }

        return keyMatrix;
    }

}
