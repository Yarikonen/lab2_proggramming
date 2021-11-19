package pokemons.species;

import pokemons.attacks.PetalDance;
import ru.ifmo.se.pokemon.*;

public class Starmie extends Staryu {
    public Starmie(String name, int n) {
        super(name, n);
        setStats(60, 75, 85, 100, 85, 115);
        addType(Type.PSYCHIC);
        addMove(new PetalDance());

    }
}
