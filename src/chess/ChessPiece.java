package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{

	//ATRIBUTOS
	private Color color;

	
	//CONSTRUTORES
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	
	//ENCAPSULAMENTO
	public Color getColor() {
		return color;
	}


	
	
}
