/**Important notes!!
 *
 * For the GameBoard Class you will be checking constructing objects from the Tetromino class.
 * the tetromino type will be decided with a random integer that will pick from the tetrominoTypes String array
 * Then the program will construct a tetromino type with
 *
 */
public class GameBoard {
    // create the board
    private int tetrisBoard[][];

    //create a tetromino with argument String;
    Tetromino tetromino;

    //list to pull the tetromino type from
    private String [] tetrominoTypes={"square","forwardL","backL","line","tShape"};

    //copy the tetromino onto the gameboard with nested loop structure.
    //x and y coordinates specify the new location for copy, use 1 to fill the array with the tetromino.
    public void set(Tetronimo t, int x, int y){

    }

    //check if the block if the array index below the current tetromino is 2
    //if it is 2 then change the tetromino state to 2
    //else set the tetromino to move down one space
    public void check(){

    }
}
