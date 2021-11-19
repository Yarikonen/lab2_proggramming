package pokemons.attacks;

import ru.ifmo.se.pokemon.*;

public class Fly extends PhysicalMove {
    public Fly() {
        super(Type.FLYING, 90, 95);
    }

    @Override
    protected String describe() {
        return "взлетел";
    }
}
