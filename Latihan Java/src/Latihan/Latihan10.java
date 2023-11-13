package Latihan;
import java.util.Arrays;
import static Fungsi.Fungsi1.*;

public class Latihan10 {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3},{4,5,6}};
        int[][] mat2 = {{10,11,12},{13,14,15}};
        int[][] mat3 = additionMatrix(mat1, mat2);
        System.out.println(Arrays.deepToString(mat3));
        int[][] mat4 = {{1,2,3},
                        {4,5,6}};
        int[][] mat5 = {{10,11,12},
                        {13,14,15}};
        int[][] mat6 = multiplyMatrix(mat4, mat5);
        System.out.println(Arrays.deepToString(mat6));

    }
}
