package gameboardobjects.piece;

import gameboardobjects.contracts.GameObjectColorEnum;
import gameboardobjects.parents.Piece;

public class Bishop extends Piece {

	public Bishop(int row, int col, GameObjectColorEnum color) {
		super(row, col, color, "B");
	}

	@Override
	public boolean isMovePosible(int toRow, int toCol) {
		
		int rowCoefficient = Math.abs(toRow - this.row);
		int colCoefficient = Math.abs(toCol - this.col);
		
		return (rowCoefficient == colCoefficient); 
	}

	@Override
	public boolean isAttackPosible(int toRow, int toCol) {
		return isMovePosible(toRow, toCol);
	}
}