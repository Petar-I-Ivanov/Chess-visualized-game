package gameboardobjects.piece;

import gameboardobjects.contracts.GameObjectColorEnum;
import gameboardobjects.parents.Piece;

public class Rook extends Piece {

	public Rook(int row, int col, GameObjectColorEnum color) {
		super(row, col, color, "R");
	}

	@Override
	public boolean isMovePosible(int toRow, int toCol) {
		int rowCoefficient = Math.abs(toRow - this.row);
		int colCoefficient = Math.abs(toCol - this.col);
		
		if((rowCoefficient > 0) && colCoefficient == 0) {
			return true;
		}
		if((colCoefficient > 0) && rowCoefficient == 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isAttackPosible(int toRow, int toCol) {
		return isMovePosible(toRow, toCol);
	}
}