package businessHouseGameDSG.entity;

import java.math.BigDecimal;

/**
 * This is a tagging interface
 */
public interface Cell {
	
	default BigDecimal handleLendMoney() {
		return new BigDecimal(0);
	}

}
