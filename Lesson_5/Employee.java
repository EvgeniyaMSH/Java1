package Lesson_5;

public class Employee {
    private static Object Employe;
    private String name;
    private String position;
    private String mail;
    private String phone;
    private double salary;
    private int age;

    Employee(String name, String position, String mail, String phone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.mail = mail;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    static <employe, NotNull> void employee40age(@NotNull Employee[] employe) {
        for (Employee employee : employe) {

            if (employee.age > 40) {
                System.out.println(employee.toString());
            }
        }
    }
    public String String() {
        return "Employee{" +
                "name='" + name + ", position='" + position + ", mail='" + mail + ", phone='" + phone + ", salary=" + salary +
                ", age=" + age;
    }
}
