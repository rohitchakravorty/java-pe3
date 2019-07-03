package com.stackroute.pe3;
/*to compute the addition of two matrix, Read the number of rows and columns
as input, also the values of each matrix*/
public class MatrixAddition
{
    int[][] matrix1,matrix2;
    int rows,columns;

    public void MatrixInitialisation(int rows,int columns)  //Creating the matrix
    {
        this.rows=rows;
        this.columns=columns;
        matrix1=new int[rows][columns];
        matrix2=new int[rows][columns];
    }
    public void setMatrices(int[] a,int[] b)     //Setting the matrix
    {    int k=0;int l=0;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                matrix1[i][j]=a[k++]; matrix2[i][j]=b[l++];
            }
        }
    }
    public Integer[][] addMatrices(int[][]matrix1,int[][]matrix2)     //Add the matrices
    {   Integer[][] sum= new Integer[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        } return sum;
    }
}

