package Latihan;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BufferedStream{
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("Contoh2.txt");
        BufferedReader buffereader = new BufferedReader(reader);
        buffereader.mark(300);
        Scanner scan = new Scanner(buffereader);
        System.out.println(scan.nextLine());
        buffereader.reset();
        buffereader.close();
    }
}
