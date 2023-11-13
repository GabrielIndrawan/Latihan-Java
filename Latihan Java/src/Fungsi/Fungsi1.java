package Fungsi;

public class Fungsi1 {
    public static void selectionSort(int[] arrays)
    {
        int store;
        for(int i=0;i < arrays.length-1; i+=1)
        {
            for(int j=i+1; j<arrays.length;j+=1)
            {
                if(arrays[i]>arrays[j])
                {
                    store = arrays[i];
                    arrays[i]=arrays[j];
                    arrays[j]=store;
                }

            }
        }
    }

    public static int[][] additionMatrix(int matrix1[][], int matrix2[][])
    {
        if((matrix1.length!=matrix2.length)||(matrix1[1].length!=matrix2[1].length))
        {
            int[][] matrixHasil = {{}};
            return matrixHasil;
        }

        int matrixhasil[][] = new int[matrix1.length][matrix1[1].length];
        for(int i=0;i < matrix1.length; i+=1)
        {
            for(int j=0; j < matrix1[1].length;j+=1)
            {
                matrixhasil[i][j] = matrix1[i][j]+matrix2[i][j];
            }
        }
        return matrixhasil;
    }

    public static int[][] multiplyMatrix(int matrix1[][], int matrix2[][])
    {
        if(matrix1[1].length!=matrix2.length)
        {
            int matrixHasil[][] = {{}};
            return matrixHasil;
        }
        int[][] matrixHasil = new int[matrix1.length][matrix2[1].length];
        for(int i=0;i < matrix2[1].length; i+=1)
        {
            for(int j=0; j < matrix1.length;j+=1)
            {
                for(int k=0; k < matrix2.length;k+=1)
                {
                    matrixHasil[j][i]+=matrix1[j][k]*matrix2[k][i];
                }
            }
        }
        return matrixHasil;
    }

    public static int getDeterminant(int[][] matrix1)
    {
        int[] MultiplyResult = new int[matrix1.length];
        int z;
        int y;
        for(int x=0; x< matrix1.length; x+=1)
        {
            MultiplyResult[x] = 1;
            z = x;
            for (y = 0; y < matrix1.length; y += 1)
            {
                if (y<0)
                {
                    y=(matrix1.length-1);
                }
            }
            MultiplyResult[x] *= matrix1[y][z - y];
        }
    }
}
