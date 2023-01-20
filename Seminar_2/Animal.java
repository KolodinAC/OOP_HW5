package Seminar_2;

public abstract class Animal {

    private String name;
    private int box;

    public Animal(String name, int box) {
        this.name = name;
        this.box = box;
    }
    
    @Override
    public String toString() {
        return String.format("Кличка: %s Клетка: %d", this.name, this.box);
    }

    public abstract String voice();
}
