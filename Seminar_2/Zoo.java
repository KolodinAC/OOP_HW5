package Seminar_2;
import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private ArrayList<Animal> animals;
    private Radio radio = new Radio();

    public Zoo() {
        animals = new ArrayList<Animal>();
    }

    public Zoo addAnimal (Animal a) {
        animals.add(a);
        return this;
    }

    public List<Speakable> getSpeakables(){
        List<Speakable> answer = new ArrayList<Speakable>();
        for (Animal an  : animals) {
            answer.add(an);
        }
        answer. add(radio);
        return answer;

    }
    public ArrayList<Animal> getAnimals() {
            return animals;
        }

}
