package gameboardobjects.piece;

import gameboardobjects.contracts.GameObjectColorEnum;
import gameboardobjects.parents.Piece;

public class King extends Piece {

	public King(int row, int col, GameObjectColorEnum color) {
		super(row, col, color, "K");
	}

	@Override
	public boolean isMovePosible(int toRow, int toCol) {
		int rowCoefficient = Math.abs(toRow - this.row);
		int colCoefficient = Math.abs(toCol - this.col);
		
		return 	(rowCoefficient == 1) || 
				(colCoefficient == 1);  
	}

	@Override
	public boolean isAttackPosible(int toRow, int toCol) {
		return isMovePosible(toRow, toCol);
	}
}
