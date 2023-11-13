package Latihan;

import java.util.*;
import static Fungsi.Fungsi1.*;

public class Latihan9 {
    public static void main(String[] args)
    {
        int Angka[];
        int Angka2[] = {1,2,3,4,5,6,7,8,9,10};
        int Angka3[][]={{1,2,3},{4,5,6},{7,8,9}};
        int[] Angka4 = {3,7,4,8,1,10,9};
        selectionSort(Angka4);
        System.out.println(Arrays.toString(Angka4));
        String Nama[]= {"Abel","Deon","Dedek"};
        Angka = Angka2;
        System.out.print(Arrays.toString(Angka2)+"\n");
        System.out.print(Arrays.toString(Angka)+"\n");
        System.out.print(Arrays.toString(Angka3)+"\n");
        Angka2[9]=1000;
        System.out.print(Arrays.toString(Angka2)+"\n");
        System.out.print(Arrays.toString(Angka)+"\n");
        System.out.print(Arrays.toString(Nama)+"\n");
    }
}
