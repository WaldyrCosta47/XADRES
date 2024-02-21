package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	
	
	/* o copilador reclama a falata do construtor
	 * botao direito | SOURCE | USING FIELDS
	 * APÓS GERAR OS GETS e apaga o setColor
	 * para nao permitir que se mexa cor da peça
	 */
	
	

}
