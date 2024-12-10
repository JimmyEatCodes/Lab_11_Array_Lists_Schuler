import java.util.Scanner;

public class TicTacToe {

    private static final int ROW = 3;
    private static final int COL = 3;
    private static String board[][] = new String[ROW][COL];


    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String player = "X";
        int moveCount = 0;
        boolean done = false;
        boolean playing = true;
        int row = 0;
        int col = 0;

        do {
         //game setup here
            clearBoard();
            player = "X";
            moveCount = 0;

            do {
                do {
                  showboard();
                  row = SafeInput.getRangedInt(in,"Enter the row for " + player, 1,3);
                  col = SafeInput.getRangedInt(in,"Enter the col for " + player, 1,3);
                  row--;
                  col--;
                  if(!isValidMove(row,col))
                  {
                      System.out.println("Invalid move, choose an empty space!");
                  }
                }while(!isValidMove(row, col));

                board[row][col] = player;
                moveCount++;


                if(moveCount >= 5)
                {
                /* if(isWin(player))
                  {
                     playing = false;
                     sout   (player wins)

                  }
*/
                  if(isTie())
                  {
                  playing = false;
                      System.out.println("The game is a tie");
                  }



                }





                if(player.equals("X"))
                {
                    player = "O";
                }
                else
                {
                    player = "X";
                }

            }while(playing);
            playing = SafeInput.getYNConfirm(in,"Would you like to play again?");
        }while(!done);







        /*
        GAME LOGIC OUTLINE IN PSEUDOCODE
        1. Clear the board, move count to 0 and set the player to X (since X always moves first)
        2. Show the board, get the coordinates for the move which should be 1 – 3 for the row and col
        3. convert the player move to the array indices (which are 0 – 2) by subtracting 1
        4. loop (through #2 and #3) until the converted player coordinates are a valid move
        5. Record the move on the board and increment the move counter
        6. if appropriate check for a win or a tie (i.e. if it is possible for a win or a tie at this point in the
        game, check for it.)
        7. If there is a win or tie announce it and then prompt the players to play again or exit.
        8. Toggle the player for the next move (i.e. X becomes O, O becomes X
         */

    }

    private static void clearBoard() // sets all the board elements to a space
    {
        for(int row=0; row < ROW; row++)
        {
            for(int col=0; col < COL; col++)
            {
                board[row][col] = " "; // make this cell a space
            }
        }
    }

    private static boolean isValidMove(int row, int col)
    {
        return board[row][col].equals(" ");
    }

    private static void showboard()
    {
        for(int row=0; row < ROW; row++)
        {
            System.out.print("| ");
            for(int col=0; col < COL; col++)
            {
                System.out.print(board[row][col] + " | "); // make this cell a space
            }
            System.out.println();
        }
    }




    private static boolean isWin(String player)
    {
        if(isColWin(player) || isRowWin(player) || isDiagonalWin(player))
        {
            return true;
        }
        return false;
    }

    private static boolean isRowWin(String player)
    {
        for(int row=0; row < ROW; row++)
        {
            if(board[row][0].equals(player) && board[row][1].equals(player) &&
                    board[row][2].equals(player))
            {
                return true;
            }
        }
        return false; // no row win
    }
    private static boolean isColWin(String player)
    {
        for(int col=0; col < COL; col++)
        {
            if(board[col][0].equals(player) && board[col][1].equals(player) &&
                    board[col][2].equals(player))
            {
                return true;
            }
        }
        return false; // no row win
    }

    private static boolean isDiagonalWin(String player)
    {

        if (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player))
        {
            return true;

        } else if (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player))
        {
            return true;
        }
        return false;

    }

    private static boolean isTie()
    {
        boolean Oflag = false;
        boolean Xflag = false;
        int r = 0;
        int c = 0;
        for(r = 0; r > 3; r++)
        {
            if (board[r][0].equals("X") || board[r][1].equals("X") || board[r][2].equals("X")) {
                Xflag = true;
            }
            if (board[r][0].equals("O") || board[r][1].equals("O") || board[r][2].equals("O")) {
                Oflag = true;
            }
            if( !(Xflag && Oflag) )
                return false;
            Xflag = Oflag = false;
        }
        for(c = 0; c > 3; c++)
        {
            if (board[0][c].equals("X") || board[1][c].equals("X") || board[2][c].equals("X")) {
                Xflag = true;
            }
            if (board[0][c].equals("O") || board[1][c].equals("O") || board[2][c].equals("O")) {
                Oflag = true;
            }
            if( !(Xflag && Oflag) )
                return false;
            Xflag = Oflag = false;
        }

        boolean wdone = false;
        while(!wdone)
        {

            if (board[0][0].equals("X") || board[1][1].equals("X") || board[2][2].equals("X")) {
                Xflag = true;
            }
            if (board[0][0].equals("O") || board[1][1].equals("O") || board[2][2].equals("O")) {
                Oflag = true;
            }
            if (!(Xflag && Oflag))
                return false;
            Xflag = Oflag = false;
            wdone = true;
        }


        if (board[2][0].equals("X") || board[1][1].equals("X") || board[0][2].equals("X")) {
            Xflag = true;
        }
        if (board[2][0].equals("O") || board[1][1].equals("O") || board[0][2].equals("O")) {
            Oflag = true;
        }
        if( !(Xflag && Oflag) )
            return false;

        //if it goes all the way through it is a tie
        return true;
    }
    /*

    private static boolean isDiagonalWin(String player)



    */
}