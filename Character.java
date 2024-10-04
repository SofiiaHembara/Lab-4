package lab4;

public abstract class Character {
    protected int power;
    protected int hp; 

    public Character(int power, int hp){
        this.power = power;
        this.hp = hp;
    }
    public abstract void kick(Character c);

    public  boolean isAlive(){
        return hp > 0;
    }
    public int getPower() {
        return power;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
    public void setPower(int power) {
        this.power = Math.max(power, 0);
    }
}
