package pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class TeeterDance extends StatusMove {
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }

    @Override
    protected String describe() {
        return "наводит суету на поле";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect.confuse(pokemon);
    }

    public TeeterDance() {
        super(Type.NORMAL, 0, 100);
    }
}
