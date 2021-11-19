package pokemons.species;

import pokemons.attacks.LeechSeed;

public class Slaking extends Vigoroth {
    public Slaking(String name, int n) {
        super(name, n);
        setStats(150, 160, 100, 95, 65, 100);
        addMove(new LeechSeed());

    }
}
