package pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class HyperBeam extends SpecialMove {
    private boolean k;

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (k) {
            pokemon.addEffect((new Effect()).attack(0.0D).turns(1));
        }
    }

    @Override
    protected String describe() {
        return "использует гипер луч";
    }

    @Override
    protected boolean checkAccuracy(Pokemon pokemon, Pokemon pokemon1) {
        k = super.checkAccuracy(pokemon, pokemon1);
        return super.checkAccuracy(pokemon, pokemon1);
    }

    public HyperBeam() {

        super(Type.NORMAL, 150, 90);
    }
}
