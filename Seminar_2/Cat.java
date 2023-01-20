package Seminar_2;

public class Cat extends Animal{

    private String color;

    public Cat(String name, int box, String color) {
        super(name, box);
        this.color = color;
    }

    @Override
    public String voice() {
        return "Мяу";
    }

    
    
    
}
