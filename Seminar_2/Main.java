package Seminar_2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Васька", 1, "серый"))
                .addAnimal(new Horse("Серебряный", 25));

        for (Animal an : zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.voice());
        }

        System.out.println("Многообразие звуков в зоопарке:");

        for (Speakable speak : zoo1.getSpeakables()) {
            System.out.println(speak.voice());

        }
    }

}
