package Latihan;

import java.util.*;

public class Latihan8 {

    private static void rekursif(int angka)
    {
        if(angka == 0)
        {
            return;
        }
        System.out.println("Menampilkan angka = "+angka);
        rekursif(angka-1);
    }
    private static void tampilkanjumlah(Scanner scan)
    {
        System.out.print("Masukkan jumlah angka yang ingin ditampilkan : ");
        int jumlah = scan.nextInt();
        rekursif(jumlah);
    }

    private static void inputnama(Scanner scan)
    {
        System.out.print("Ketikan nama anda : ");
        String nama = scan.nextLine();
        System.out.print("Hello World "+nama+".\n");
    }

    public static void main(String[] args)
    {
        //Fungsi biasa
        Scanner ambil = new Scanner(System.in);
        inputnama(ambil);
        tampilkanjumlah(ambil);
        //Contoh fungsi Rekursif

    }
}
