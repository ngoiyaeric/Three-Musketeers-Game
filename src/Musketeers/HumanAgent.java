package lab2;
import java.util.List;
import java.util.Scanner;

import lab2.Exceptions.InvalidMoveException;



public class HumanAgent extends Agent {
    public HumanAgent(Board board) {
        super(board);
    }
    /**
     * Prompts the human for a move with from and to coordinates 
     * makes sure its valid.
     * Creates a Move object with the chosen fromCell and toCell
     * @return the valid human inputted Move
     */

    private Cell getfromcell (List <Cell> possibleCells) {
        String prompt = "Possible pieces are " + this.board.getPossibleMoves();
        //How to return the cell using the coordinate
        return null;
    }
    
    private static Coordinate getfromCoordinate (String prompt) {
        System.out.println("Enter From coordinate");
        Scanner from = new Scanner(System.in);
        String fromcell = from.nextLine();
        from.close();
        try {
            return Utils.parseUserMove(fromcell.strip().toUpperCase());
        } catch(InvalidMoveException e) {
                return getfromCoordinate(prompt);
        }
        }
    
    private static Coordinate gettoCoordinate (String prompt) {
        System.out.println("Enter to coordinate");
        Scanner to = new Scanner(System.in);
        String tocell = to.nextLine();
        try {
            return Utils.parseUserMove(tocell.strip().toUpperCase());
        } catch(InvalidMoveException e) {
                return gettoCoordinate(prompt);
    }
    }       
    @Override
    public Move getMove() { 
        //get possible from cells and to possible
        //call getfrom cell to get the from cells
        // get tocells to get the destination
        //return new move from cell to cell
        return null;
    }
}
