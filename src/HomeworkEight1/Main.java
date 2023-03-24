package HomeworkEight1;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jack", 25, 'M', 100);
        System.out.println(employee1.getSalary(5));

        Manager manager1 = new Manager("John", 30, 'M', 200, 2);
        System.out.println(manager1.getSalary(2));
    }
}