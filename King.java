package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	public King(Board board, Color color) {
		super(board, color);
		/* TODO Auto-generated constructor stub
		 * gerado pelop sinal vermelho na coluna
		 */
	}

	
	@Override
	public String toString() {
		return "K";
	}
}
