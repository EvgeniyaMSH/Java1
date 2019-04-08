package Lesson_5;

public class ListEmployee {
    private final int COUNT = 5;
    private Employee[] employee;

    public ListEmployee() {
        employee = new Employee[COUNT];

        employee[0] = new Employee("Petr", "Economist",
                "Petr@mail.ru", "89005555555", 50000, 35);
        employee[1] = new Employee("Andrey", "Lower",
                "Andrey@mail.ru", "89005555554", 60000, 34);
        employee[2] = new Employee("Alex", "Manager",
                "Alex@mail.ru", "89005555553" , 70000, 40);
        employee[3] = new Employee("Sergey", "Seller",
                "Sergey@mail.ru", "89005555552", 25000, 51);
        employee[4] = new Employee("Evgeniiy", "Engineer",
                "Evgeniiy@mail.ru", "89005555551", 30000, 29);
    }

    public void employee40age() {
        Employee.employee40age(employee);
    }
}