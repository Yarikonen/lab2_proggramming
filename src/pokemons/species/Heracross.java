package pokemons.species;

import pokemons.attacks.*;
import ru.ifmo.se.pokemon.*;

public class Heracross extends Pokemon {
    public Heracross(String name, int n) {
        super(name, n);
        setType(Type.BUG,Type.FIGHTING);
        setStats(80, 125, 75, 40, 95, 85);
        setMove(new KnockOff(), new HyperBeam(), new Detect(), new TeeterDance());
    }
}