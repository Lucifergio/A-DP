package chess.chessBoard;

import chess.pieces.Moves;

public class ChessBoard implements Moves{

    private Moves[][] board = new Moves[8][8];

    public Moves[][] getBoard() {
        return board;
    }

    public void setBoard(Moves[][] board) {
        this.board = board;
    }

    public void moves(int coordinates, String type, String allegiance) {

    }
}
