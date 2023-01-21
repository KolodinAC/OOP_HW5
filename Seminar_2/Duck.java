package Seminar_2;

public class Duck extends Animal implements Runable, Flyable {

    public Duck(String name, int box) {
        super(name, box);
    }

    @Override
    public int speedofFly() {
        return 75;
    }

    @Override
    public String voice() {
        return "Кря - Кря";
    }

    @Override
    public int speedofRun() {
        
        return 5;
    }
    
}
