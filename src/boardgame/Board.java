package boardgame;

public class Board {

	//ATRIBUTOS
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	
	//CONSTRUTORES
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	
	//ENCAPSULAMENTO
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	
	//METODOS
	
}
