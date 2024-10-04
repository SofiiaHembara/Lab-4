package lab4;

import java.util.Random;

public class King extends Character {
    private static Random random = new Random();

    public King(){
        super(random.nextInt(11) + 5, random.nextInt(11) + 5);
    }

    @Override
    public void kick(Character c){
        int damage = random.nextInt(this.power) + 1;
        c.setHp(c.getHp() - damage);
    }
    public int getHp() {
        return this.hp;
    }
    public int getPower() {
        return this.power;
    }

}
