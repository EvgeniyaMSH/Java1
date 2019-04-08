package Lesson_7;

class Plates {
    private int food;

    Plates(int food) {
        this.food = food;
    }

    /**
     * @param n
     * @return
     */
    boolean bigFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }

    void addFood(int food) {
        switch (this.food += food) {
        }
    }

    void info() {
        System.out.println("plate: " + food);
    }
}