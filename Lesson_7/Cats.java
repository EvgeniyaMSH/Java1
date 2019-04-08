package Lesson_7;

class Cats {
        private String name;
        private int eating;
        private boolean hungry;

    public Cats(String Barsik, int i) {
    }

    void info() {
            String Hungry = !hungry ? "не голоден" : "голоден";
            System.out.println(name + ": " + Hungry);
        }

        void eat(Plates plate) {
            if (hungry && plate.bigFood(eating))
                hungry = false;
        }
    }

