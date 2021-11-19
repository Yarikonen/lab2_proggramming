package pokemons.species;

import pokemons.attacks.*;
import ru.ifmo.se.pokemon.*;

public class Staryu extends Pokemon {
    public Staryu(String name, int n) {
        super(name, n);
        addType(Type.WATER);
        setStats(30, 45, 55, 70, 55, 85);
        setMove(new PoisonSting(), new TeeterDance(), new Fly());


    }
}
