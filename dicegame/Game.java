package dicegame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Game {

    protected Random rand = new Random();     //obiekt losujący
    protected List<Player> Players = new ArrayList();

    public void addPlayer(Player player) { 
        if (player != null) {
            if(!nameExists(player.getName())){
                Players.add(player);
            }
            else{
                player.setName(player.getName()+rand.nextInt(10));
                addPlayer(player);
            }
        } else {
            throw new IllegalArgumentException("Gracz nie moze byc null");
        }
    }
    private boolean nameExists(String name){
        for (Player player : Players) {
            if(player.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
    public void play() {
        int number, //wylosowana liczba
                guess;                      //propozycja (strzał) gracza
        boolean oneMore;
        do {
            oneMore = true;
            System.out.println("---------------------");

            number = rand.nextInt(6) + 1;
            System.out.println("Kostka: " + number);
            for (Player player : Players) {
                guess = player.guess();

                System.out.println("Gracz " + player.getName() + ": " + guess);

                if (number != guess) {
                    System.out.println("PUDŁO!");
                } else {
                    oneMore = false;
                    System.out.println("BRAWO!");
                }
            }
        } while (oneMore);
    }
}
