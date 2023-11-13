package Latihan;

import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Ketikan angka pertama = ");
        a=myScanner.nextInt();
        System.out.print("Ketikan angka kedua   = ");
        b=myScanner.nextInt();
        c = a + b;
        System.out.printf("Hasil penumlahannya adalah = %d",c);

        /*
        byte x = (byte)500;
        System.out.print("Byte = " + x);
         */
    }
}
