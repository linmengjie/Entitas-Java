package com.ilargia.games.core.gen.game;

import com.ilargia.games.core.component.game.Asset;
import com.ilargia.games.core.component.game.Destroy;
import com.ilargia.games.core.component.game.GameBoard;
import com.ilargia.games.core.component.game.GameBoardElement;
import com.ilargia.games.core.component.game.Interactive;
import com.ilargia.games.core.component.game.Movable;
import com.ilargia.games.core.component.game.Position;
import com.ilargia.games.core.component.game.TextureView;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class GameComponentsLookup {

	public static final int Asset = 0;
	public static final int Destroy = 1;
	public static final int GameBoard = 2;
	public static final int GameBoardElement = 3;
	public static final int Interactive = 4;
	public static final int Movable = 5;
	public static final int Position = 6;
	public static final int TextureView = 7;
	public static final int totalComponents = 8;

	public static String[] componentNames() {
		return new String[]{"Asset", "Destroy", "GameBoard",
				"GameBoardElement", "Interactive", "Movable", "Position",
				"TextureView"};
	}

	public static Class[] componentTypes() {
		return new Class[]{Asset.class, Destroy.class, GameBoard.class,
				GameBoardElement.class, Interactive.class, Movable.class,
				Position.class, TextureView.class};
	}
}