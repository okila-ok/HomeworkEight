package homeworkEight2;

public class Director extends BaseManager {

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalaryManager(){
        if(getNumberOfSubordinates() ==0){
            return getBaseSalary();
        } else {
            return (int) (getBaseSalary() * (getNumberOfSubordinates() / 100.0 * 9));
        }
    }
}
