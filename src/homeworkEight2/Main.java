package homeworkEight2;

public class Main {

    public static void main(String[] args) {
        EmployeeUtils empUtils = new EmployeeUtils();

        Employee emp1 = new homeworkEight2.Employee("Arnold", 10);
        Employee emp2 = new homeworkEight2.Employee("Phoebe", 20);
        Employee emp3 = new homeworkEight2.Employee("Helga", 30);
        Employee[] employees = {emp1, emp2, emp3};
        System.out.println(EmployeeUtils.findByName("Arnold", employees));
        System.out.println(EmployeeUtils.findByName("Anna", employees));
        System.out.println(empUtils.findBySubName("Ph", employees));
        System.out.println(empUtils.findBySubName("ph", employees));

        Worker wr1 = new Worker("Pete", 10);
        Worker wr2 = new Worker("Tim", 20);
        Worker[] workers = {wr1, wr2};
        System.out.println(empUtils.findMaxSalary(workers));
        System.out.println(empUtils.salarySum(workers));

        // N.B. the code will give 0 for small baseSalary and small numberOfSubordinates
        Manager man1 = new homeworkEight2.Manager("Joe", 1000, 100);
        Manager man2 = new homeworkEight2.Manager("John", 2000, 200);
        Manager man3 = new homeworkEight2.Manager("Lee", 3000, 300);
        Manager[] managers = {man1, man2, man3};
        System.out.println(EmployeeUtils.findMinSalary(managers));
        System.out.println(EmployeeUtils.findMaxNumberOfSubordinates(managers));
        System.out.println(EmployeeUtils.findMaxIncrement(managers));

        Director dir1 = new Director("Chris", 10, 1);
        Director dir2 = new Director("Kyle", 20, 2);
        Director dir3 = new Director("Jasper", 30, 3);
        Director[] directors = {dir1, dir2, dir3};
        System.out.println(EmployeeUtils.findMinNumberOfSubordinates(directors));
    }
}