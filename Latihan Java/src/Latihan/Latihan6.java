package Latihan;

public class Latihan6 {
    public static void main(String[] args)
    {
        //Latihan Looping
        //Deklarasi Variabel
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                System.out.print("* ");
                if (i == j || i+j == 8 )
                {
                    break;
                }
            }
            System.out.print("\n");
        }
    }
}
