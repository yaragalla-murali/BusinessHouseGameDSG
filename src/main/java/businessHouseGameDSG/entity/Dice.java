package businessHouseGameDSG.entity;

import java.util.LinkedList;
import java.util.Queue;

public class Dice {

    private Queue<Integer> diceoutputs = new LinkedList<>();


    public boolean setup(String diceoutputStr) {
        return true;
    }

    public Integer giveDiceOutput() {
        return 0;
    }
}
