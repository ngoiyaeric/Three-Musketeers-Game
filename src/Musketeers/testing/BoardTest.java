package lab2.testing;

import org.junit.*;

import lab2.Board;
import lab2.Cell;
import lab2.Coordinate;

public class BoardTest {

    private Board board;


    public void setup() {
        this.board = new Board();
    }


    public void testGetCell() {
        Cell cell = board.getCell(new Coordinate(1, 4));
        Assert.assertNotNull(cell.getPiece());
    }

}
