package pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class SeismicToss extends PhysicalMove {
    private int k;

    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, k);
    }

    @Override
    protected String describe() {
        return "опрокинул противника";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        k = pokemon.getLevel();
        super.applySelfEffects(pokemon);
    }

    public SeismicToss() {
        super(Type.FIGHTING, 0, 100);
    }
}
