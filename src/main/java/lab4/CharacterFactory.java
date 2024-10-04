package lab4;

import java.util.Random;

public class CharacterFactory {
    private Random random = new Random();

    public Character createCharacter() {
        int rand = random.nextInt(4);
        switch (rand) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new King();
            case 3:
            default:
                return new Knight();
        }
    }
}
