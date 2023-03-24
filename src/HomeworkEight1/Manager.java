package HomeworkEight1;

public class Manager extends BaseEmployee {
    private int workerCount;


    public Manager(String name, int age, char sex, int daySalary, int workerCount) {
        super(name, age, sex, daySalary);
        this.workerCount = workerCount;
    }

    public void setWorkerCount(int workerCount){
        this.workerCount = workerCount;
    }

    public int getWorkerCount(){
        return workerCount;
    }

    public int getSalary(int days){

        int salary = getDaySalary() * days;
        return (int) (salary + salary * (getWorkerCount() / 100.0));
    }
}
