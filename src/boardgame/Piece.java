package boardgame;

public class Piece {

	//ATRIBUTOS
	protected Position position;
	private Board board;
	
	
	//CONSTRUTORES
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	
	//ENCAPSULAMENTO
	protected Board getBoard() {
		return board;
	}
}
