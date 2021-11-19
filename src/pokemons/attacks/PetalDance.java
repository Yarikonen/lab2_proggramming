package pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class PetalDance extends SpecialMove {
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "унизил противника танцем";
    }

    public PetalDance() {
        super(Type.GRASS, 120, 100);
    }
}
