package pokemons.species;

import pokemons.attacks.*;

public class Vigoroth extends Slakoth {
    public Vigoroth(String name, int n) {
        super(name, n);
        setStats(80, 80, 80, 55, 55, 90);
        addMove(new SeismicToss());

    }
}
