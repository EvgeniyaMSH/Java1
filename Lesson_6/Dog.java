package Lesson_6;

public class Dog extends Animal {

    public boolean jump(double jump) {
        return (jump > 0 && jump <= 0.5);
    }
}

class Dog1 extends Dog {

    public boolean run(double run) {
        return (run > 0 && run <= 560);
    }

    public boolean swim(double swim) {
        return (swim > 0 && swim <= 10);
    }
}
public class Dog2 extends Dog {
    public boolean run(double run) {
        return (run > 0 && run <= 350);
    }
        public boolean swim(double swim) {
        return (swim > 0 && swim <= 3);
    }
}