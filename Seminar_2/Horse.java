package Seminar_2;

public class Horse extends Animal {

    public Horse(String name, int box) {
        super(name, box);
    }

    @Override
    public String voice() {
        return "Издает звук: И-ГО-ГО";
    }
    
    @Override
    public String toString() {
        return  "Конь " + super.toString();
    }
}
