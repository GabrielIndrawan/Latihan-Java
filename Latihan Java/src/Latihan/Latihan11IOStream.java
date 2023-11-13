package Latihan;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import Fungsi.Fungsi1.*;

public class Latihan11IOStream {
    public static void main(String[] args) throws IOException {
        FileInputStream inputer = null;
        FileOutputStream outputer = null;
        try {
            inputer = new FileInputStream("Contoh.txt");
            outputer = new FileOutputStream("Output.txt");
            int text = inputer.read();
            while(text != -1)
            {
                outputer.write(text);
                text = inputer.read();
            }
        } finally {
            if (outputer != null) {
                outputer.close();
            }
            if (inputer != null) {
                inputer.close();
            }
        }
    }
}
