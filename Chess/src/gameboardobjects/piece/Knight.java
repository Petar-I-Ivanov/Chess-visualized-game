package gameboardobjects.piece;

import gameboardobjects.contracts.GameObjectColorEnum;
import gameboardobjects.parents.Piece;

public class Knight extends Piece {

	public Knight(int row, int col, GameObjectColorEnum color) {
		super(row, col, color, "Kn");
	}

	@Override
	public boolean isMovePosible(int toRow, int toCol) {
		int rowCoefficient = Math.abs(toRow - this.row);
		int colCoefficient = Math.abs(toCol - this.col);
		
		if((rowCoefficient == 2) && (colCoefficient == 1)) {
			return true;
		}
		if((colCoefficient == 2) && (rowCoefficient == 1)) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isAttackPosible(int toRow, int toCol) {
		return isMovePosible(toRow, toCol);
	}
}