package application;

import chess.ChessMatch;


public class Program {

	public static void main(String[] args) {
		
		ChessMatch ChessMatch = new ChessMatch();
		// para imprimir o tabuleiro crio uma classe
		 
		UI.printBoard(ChessMatch.getPieces());
	}

}
