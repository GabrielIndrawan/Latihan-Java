package Latihan;

import java.util.*;

public class Latihan7 {
    public static void main(String[] args)
    {
        //Deklarasi
        int angka, counter, penambah1=1, penambah2=1, hasil = 1;

        //Latihan deret fibonacci bukan rekursif melainkan sequential
        Scanner input = new Scanner(System.in);
        System.out.print("Ketikan suku keberapa yang anda ingin cari nilainya : ");
        angka = input.nextInt();
        System.out.print("Berikut adalah nilai suku ke " + angka + " dalam deret fibonacci : ");
        if(angka>2)
        {
            for (counter = 2; counter < angka; counter += 1)
            {
                hasil = penambah1 + penambah2;
                penambah2=penambah1;
                penambah1=hasil;
            }
        }
        System.out.print(hasil);
    }
}
