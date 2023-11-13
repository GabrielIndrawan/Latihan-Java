package Latihan;

import java.util.*;

public class Latihan5 {
    public static void main(String[] args)
    {
        //Membuat Scanner terlebih dahulu
        Scanner input = new Scanner(System.in);

        //Deklarasi variabel dan output
        String kata;
        System.out.print("Masukkan sebuah kata : ");
        kata = input.nextLine();
        switch(kata)
        {
            case "Abel" :
                System.out.print("case Abel.");
                break;
            case "Ucup" :
                System.out.print("case Ucup.");
                break;
            default :
                System.out.print("case Default.");
        }
    }
}
