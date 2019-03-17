package dicegame;

/**
 *
 * @author olek
 */
public abstract class Player {//nie da się utworzyć instancji bo ma abstrakcyjne metody

    private String name = "Domyślny Janusz";

    /**
     * Konstruktory.
     */
    public Player() {
    }

    public Player(String name) {
        setName(name);
    }
    /**
     * Metoda "odgadująca" liczbę oczek wyrzuconą na kostce.
     *
     * @return liczb oczek (1-6)
     */
    public abstract int guess();

    /**
     * Geter pola name.
     *
     * @return imię gracza
     */
    public String getName() {
        return name;
    }

    /**
     * Seter pola name.
     *
     * Sprawdza poprawność danych (nie null i niepuste).
     *
     * @param name imię gracza
     */
    public void setName(String name) {
        if (name != null && name.matches("^[a-zA-Z][a-zA-Z0-9@\\-.]{2,29}$")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException();
        }
    }

}
