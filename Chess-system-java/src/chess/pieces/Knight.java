package chess.pieces;

import board.Board;
import board.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

    public Knight(Board board, Color color) {
        super(board, color);
    }

    private boolean canMove(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        for (int rowOffset = -2; rowOffset <= 2; rowOffset++) {
            for (int colOffset = -2; colOffset <= 2; colOffset++) {

                if (!((Math.abs(rowOffset) == 2 && Math.abs(colOffset) == 1) ||
                        (Math.abs(rowOffset) == 1 && Math.abs(colOffset) == 2))) {
                    continue;
                }

                p.setValues(position.getRow() + rowOffset, position.getColumn() + colOffset);
                if (getBoard().positionExists(p) && canMove(p)) {
                    mat[p.getRow()][p.getColumn()] = true;
                }
            }
        }


        return mat;
    }

    @Override
    public String toString(){
        return "N";
    }

}
