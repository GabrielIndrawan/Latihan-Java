package Latihan;
import Fungsi.Fungsi1.*;

import java.sql.SQLOutput;
import java.util.*;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner ambil = new Scanner(System.in);
        int bilanganBulat;
        System.out.print("Ketikan sebuah bilangan bulat : ");

        try
        {
            bilanganBulat = ambil.nextInt();
            System.out.println("Bilangan berhasil dimasukkan !");
        }
        catch(InputMismatchException error)
        {
            System.out.println("Anda tidak memasukkan data dengan tipe data yang benar !");
        }
        finally
        {
            System.out.println("Finally!");
        }

        System.out.println("Akhir program...");

    }
}
