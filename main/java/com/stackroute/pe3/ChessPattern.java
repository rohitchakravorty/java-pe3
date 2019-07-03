package com.stackroute.pe3;
/*create a ChessBoard pattern with the help of multidimensional array, where WW represents white color and BB represents Black color.*/
public class ChessPattern
{
    String[][] chess;
    int rows,columns;
    public static boolean isNumeric(String strNum)    //To validate the input
    {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    public void matrixInitialise(int rows)  //Initialised the matrix
    {
        this.rows=rows;
        this.columns=rows;
        chess=new String[rows][columns];
    }
    public String chessBoard()
    {
        int check=0;
        String chessBoard="";
        for(int loopRow=0;loopRow<rows;loopRow++)
        {
            for(int loopColumn=0;loopColumn<columns;loopColumn++)
            {
                chess[loopRow][loopColumn]=(check++%2==0)?"BB":"Ww";    //Checking odd:even
                chessBoard=chessBoard.concat(chess[loopRow][loopColumn].concat(" "));
            }
            chessBoard=chessBoard.concat("\n");
        }
        return chessBoard;
    }
}
