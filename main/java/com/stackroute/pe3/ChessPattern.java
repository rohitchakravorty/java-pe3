package com.stackroute.pe3;

public class ChessPattern {
    String[][] chess;
    int rows,columns;
    public void matrixInitialise(int rows)
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
                chess[loopRow][loopColumn]=(check++%2==0)?"BB":"Ww";
                chessBoard=chessBoard.concat(chess[loopRow][loopColumn].concat(" "));
            }
            chessBoard=chessBoard.concat("\n");
        }
        return chessBoard;
    }
}
