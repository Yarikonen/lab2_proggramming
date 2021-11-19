package pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class Mist extends StatusMove {
    @Override
    protected String describe() {
        return "усилил защиту";
    }

    public Mist(){
        super(Type.ICE, 0,100);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_DEFENSE,2);
        pokemon.setMod(Stat.DEFENSE,2);
    }
}
