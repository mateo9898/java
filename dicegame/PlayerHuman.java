package dicegame;
import java.util.Scanner;
public class PlayerHuman extends Player{
    private final Scanner in=new Scanner(System.in);//final- nie można zmienić wartości pożniej
    public PlayerHuman(String name) {
        super(name);//żeby nie powtarzać z klasy, odwołujemy się do klasy z której dziedziczymy
    }
    @Override//adnotacje-aktywne komentarze do kodu np.override
    public int guess(){
        System.out.println("Podaj liczbe (1-6): ");
        return in.nextInt();
    }
}
