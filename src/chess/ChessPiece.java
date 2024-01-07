package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{

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

	public ChessPosition getChessPosition() {
		return ChessPosition.fromPosition(position);
	}
	
	//METODOS
	protected boolean isThereOpponentPiece(Position position) {
		ChessPiece p = (ChessPiece) getBoard().piece(position);
		return p != null && p.getColor() != color;
	}
	
}
