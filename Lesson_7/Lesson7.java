package Lesson_7;

public class Lesson7 {
public static void main(String[] args) {
        Cats [] cats = {
                new Cats("Barsik", 15),
                new Cats("Mursik", 10),
                new Cats("Small", 15),
                new Cats("Big", 10),
                new Cats("Zaya", 5)
        };

        Plates plates = new Plates(30);

        for (Cats cat : cats) {
            cat.eat(plates);
            cat.info();
        }

        Plates.addFood(50);
        plates.info();

}
}