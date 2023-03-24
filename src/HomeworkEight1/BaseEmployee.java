package HomeworkEight1;

public class BaseEmployee {
    private String name;
    private int age;
    private char sex;
    private int daySalary;

    public BaseEmployee(String name, int age, char sex, int daySalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.daySalary = daySalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }

}
