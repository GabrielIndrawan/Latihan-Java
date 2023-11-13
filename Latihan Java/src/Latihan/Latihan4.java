package Latihan;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args){
        //Deklarasi variabel
        int a;
        boolean statement;

        //Membuat sebuah scanner baru
        Scanner masukannilai = new Scanner(System.in);

        //Input variable
        System.out.print("Masukkan nilai antara 4 sampai 10 : ");
        a = masukannilai.nextInt();
        statement = (a>=4 && a<=10);

        //if else statement
        if(statement)
        {
            System.out.print("Anda memasukkan nilai yang benar. \n");
            System.out.print("Nilai yang anda masukkan adalah = "+a);
        }
        else
        {
            System.out.print("Anda memasukkan nilai yang salah. \n");
            System.out.print("Nilai yang anda masukkan adalah = "+a);
        }

        masukannilai.close();
    }
}
