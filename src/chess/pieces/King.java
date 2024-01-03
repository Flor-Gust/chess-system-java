package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

	//CONSTRUTORES
	public King(Board board, Color color) {
		super(board, color);
	}
	
	
	//METODOS
	@Override
	public String toString() {
		return "K";
	}
	
}
