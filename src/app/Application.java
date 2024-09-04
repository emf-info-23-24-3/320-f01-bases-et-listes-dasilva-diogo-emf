package app;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        ArrayList<Personne> personnes = new ArrayList<>();

        personnes.add(new Personne("Da Silva", "Diogo", "rte des bugnons", "marsens", 1633));
        personnes.add(new Personne("Da Silva2", "Diogo2", "rte des bugnons2", "marsens2", 16332));

        for (Personne personne : personnes) {
            System.out.println(personne.getNom());
        }

    }

}
