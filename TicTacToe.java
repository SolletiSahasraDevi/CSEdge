import java.util.*;
public class TicTacToe
{
    public static void main(String argh[])
    {
        char[][] board=new char[3][3];
        for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                board[row][col]=' ';
            }
        }
        char player='X';
        boolean gameover=false;
        Scanner sc=new Scanner(System.in);
        while(!gameover)
        {
            printboard(board);
            System.out.println("player"+player +"enter:");
            int row=sc.nextInt();
            int col=sc.nextInt();
            if(board[row][col]==' ')
            {
                board[row][col]=player;
                gameover=havewon(board,player);
                if(gameover)
                {
                    System.out.println("player"+ player+"won");

                }
                else
                {
                    if(player=='X')
                    {
                        player='O';
                    }
                    else{
                       player='X'; 
                    }
                }
            }
            else{
                System.out.println("error.... u cant enter here");
            }
        }
       // printboard(board);
    }
    public static void printboard(char[][] board)
    {
for(int row=0;row<3;row++)
        {
            for(int col=0;col<3;col++)
            {
                System.out.print(board[row][col]+"|");
            }
            System.out.println();
        }
    }
    public static boolean havewon(char[][] board,char player)
    {
        //check rows
        for(int row=0;row<3;row++)
        {
        if(board[row][0]==player&&board[row][1]==player && board[row][2]==player)
        {
            return true;
        }
    }
    //check columns
    for(int col=0;col<3;col++)
        {
        if(board[0][col]==player&&board[1][col]==player && board[2][col]==player)
        {
            return true;
        }
    }
//diagonal
if(board[0][0]==player&&board[1][1]==player && board[2][2]==player)
        {
            return true;
}
if(board[0][2]==player&&board[1][1]==player && board[2][0]==player)
        {
            return true;
    }
    return false;
}
}