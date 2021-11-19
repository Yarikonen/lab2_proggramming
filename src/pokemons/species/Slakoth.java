package pokemons.species;

import pokemons.attacks.*;
import ru.ifmo.se.pokemon.*;

public class Slakoth extends Pokemon {
    public Slakoth(String name, int n) {
        super(name, n);
        addType(Type.NORMAL);
        setStats(60, 60, 60, 35, 35, 30);
        setMove(new Mist(), new Scratch());

    }
}
