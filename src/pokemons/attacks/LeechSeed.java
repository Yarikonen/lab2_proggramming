package pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class LeechSeed extends StatusMove {
    private int k;

    public LeechSeed() {
        super(Type.GRASS, 0, 90);


    }

    @Override
    protected String describe() {
        return "засадил semen в противника";
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {

        pokemon.addEffect((new Effect()).turns(4).stat(Stat.HP, -k));
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        k = (int) pokemon.getStat(Stat.HP) / 8;
        pokemon.addEffect((new Effect()).turns(4).stat(Stat.HP, (int) pokemon.getStat(Stat.HP) / 8));

    }
}
