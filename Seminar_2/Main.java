package Seminar_2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo1 = new Zoo();
        zoo1.addAnimal(new Cat("Васька", 1, "серый"))
                .addAnimal(new Horse("Серебряный", 25))
                .addAnimal(new Duck("Утя", 17));

        for (Animal an : zoo1.getAnimals()) {
            System.out.println(an);
            System.out.println(an.voice());
        }

        System.out.println("-------------------");

        System.out.println("Многообразие звуков в зоопарке:");

        for (Speakable speak : zoo1.getSpeakables()) {
            System.out.println(speak.voice());

        }

        System.out.println("-------------------");

        for (Runable run : zoo1.getRunables()) {
            System.out.println("Бегает со скоростью:" + run.speedofRun());
            
        }

        int max = zoo1.getMaxspeed();
        System.out.println(String.format("Максимальная скорость которую развивают животные: %d", max));

        System.out.println("-------------------");
        for (Flyable flyable : zoo1.getFLyers()) {
            System.out.printf("Cкорость полета : %d", flyable.speedofFly());
        }


    }

}
