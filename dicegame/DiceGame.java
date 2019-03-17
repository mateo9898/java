package dicegame;

/**
 * Gra w odgadywanie wylosowanej liczby.
 *
 * Zasady: - komputer rzuca kostką (losuje liczby z zakresu 1..6) - gracz (też
 * komputer) stara się odgadnąć liczbę (też losuje) - jeżeli odgadnie, gra się
 * kończy - jeżeli nie odgadnie, rozpoczyna się kolejna runda (komputer losuje
 * kolejną liczbę i gracz stara się ją odgadnąć)
 */
public class DiceGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Player player = new Player("Mietek");
//        player.setName("Ziuta");
        Game game = new Game();
        Player player = new PlayerCoup("Marian");//klasy są połączone dzięki dziedziczeniu(rodzina klas)
        //dzięki temu można wpisać ich do części współnej player nie jest playerhuman ale playerhuman jest player
        game.addPlayer(player);
        game.addPlayer(new PlayerCoup("Ziuta"));
        game.addPlayer(new PlayerCoup("Ziuta"));
        game.addPlayer(new PlayerCoup("Ziuta"));
        game.play();
        /*try {
            player.setName("6Mateo");
        } catch(IllegalArgumentException ex)  {
            System.err.println("Blad! "+ex.getMessage());
        }*/
        /*List<String> list = new ArrayList();//ArrayList to tablica dynamiczna
        list.add("raz");
        list.add("dwa");
        list.add("trzy");*/
        /*for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        
        }*/
 /*for(String o:list){
            System.out.println(o);
        }*/
        //Iterator<String> it = list.iterator();
        /*while (it.hasNext()) {
            System.out.println(it.next());
        }*/
    }

}
