package businessHouseGameDSG.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {

    private List<Cell> grid = new ArrayList<>();
    private Map<String, Integer> playersCurrentPositions = new HashMap<>();

    public boolean setup(String cellPositionsStr) { 
    	return true;
	}

    

    public List<Cell> getGrid() {
		return grid;
	}

}
