
package boardgame;

public class Board {
	private int rows;
	private int columns;
	
	// matriz de peças
	
	private Piece[][]pieces;

	public Board(int rows, int columns) {
		
		if (rows < 1 || columns < 1) {
			throw new BoardException("Erro criando o tabuleiro");
		}
	
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
		
		
	}

	public int getRows() {
		return rows;
	}


	public int getColumns() {
		return columns;
	}

		
	/* criando um metodo para retornar as linhas e colunas
	 * public retornando um objeto do tipo pice
	 */
	public Piece piece(int row, int colum) {
		if (!positionExists(row, colum)) {
			throw new BoardException("Posição não existe");
		}
	
		return pieces[row][colum];
	}

	// o mesmo metodo retornando a peça pela posiçõ an posição 
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Posição não existe");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	/* definindo a cor das peças
	 * criando com o botão direito NEW ENUM
	 */
	
		public void placePiece(Piece piece, Position position) {
			if (thereIsAPiece(position)) {
				throw new BoardException("Posição ja ocupada" + position);
				
			}
			pieces[position.getRow()][position.getColumn()] = piece;
			piece.position = position;
			
		}
		
		private boolean positionExists(int row, int column) {
			return row >= 0 && row < rows && column >= 0 && column < columns;
		}
		
	    public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	    public boolean thereIsAPiece(Position position) {
	    	if (!positionExists(position)) {
				throw new BoardException("Posição não existe");
			}
	    	return piece(position) != null;
	    }
}
