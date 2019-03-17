package dicegame;

import java.util.Random;

public class PlayerCoup extends Player{
    private final Random rand = new Random();
    public PlayerCoup (){
    }
    public PlayerCoup(String name) {
        super(name);
    }
    @Override
    public int guess() {
        return rand.nextInt(6) + 1;
    }
}
