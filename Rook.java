package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	/* tenho que fazer o construtor apos]
	 * o thow string
	 */
	@Override
	public String toString() {
		return "R";
	}

}
