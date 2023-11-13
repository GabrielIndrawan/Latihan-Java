package Latihan;

import static Fungsi.Fungsi1.getDeterminant;

public class Latihan12 {
    public static void main(String[] args) {
        int[][] matrik = {{1,2},{3,4}};
        int result = getDeterminant(matrik);
        System.out.println(result);
    }
}
