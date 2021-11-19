package pokemons.attacks;


import ru.ifmo.se.pokemon.*;

public class Detect extends StatusMove {
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().turns(1).stat(Stat.EVASION, 6));

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().turns(1).stat(Stat.ACCURACY, -6));
    }

    @Override
    protected String describe() {
        return "защитился";
    }

    public Detect() {
        super(Type.FIGHTING, 0, 10000, 4, 1);
    }
}
