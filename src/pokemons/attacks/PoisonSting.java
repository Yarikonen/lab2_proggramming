package pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class PoisonSting extends PhysicalMove {
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        if (Math.random() <= 0.3) {
            Effect.poison(pokemon);
        }
        pokemon.setMod(Stat.HP, (int) Math.round(v));
    }

    @Override
    protected String describe() {
        return "поразил противника своим жалом";
    }

    public PoisonSting() {
        super(Type.POISON, 15, 100);
    }
}
