package Latihan;

public class Latihan2 {
    public static void main(String[] args)
    {
        String nama ="Bebezinho";
        double x = 16.5;
        int umur = 18, tambahanumur = 5;
        System.out.print("Namaku adalah "+nama+" umurku "+umur+".\n");
        System.out.print("Tambahan umurku adalah "+tambahanumur+".\n");
        System.out.print("Jadi umurku "+(umur+tambahanumur)+".\n");
        System.out.print("Double = "+ x + "\n");
        int modulus = umur % tambahanumur;
        System.out.print(umur + " % " + tambahanumur + " = " + modulus);
    }
}
