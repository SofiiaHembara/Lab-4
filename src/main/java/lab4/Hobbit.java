package lab4;

public class Hobbit extends Character{
    public Hobbit() {
        super(0, 3);
    }
    @Override
    public void kick(Character c){
        toCry();
    }
    public void toCry(){
        
    }
    @Override
    public String toString() {
        return "Hobbit{hp=" + hp + ", power=" + power + "}";
    }  
}
