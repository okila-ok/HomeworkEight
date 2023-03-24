package homeworkEight2;

public class EmployeeUtils {

//    поиск сотрудника в массиве по его имени
//    поиск сотрудника в массиве по вхождению указанной строки в его имени
//    подсчет зарплатного бюджета для всех сотрудников в массиве
//    поиск наименьшей зарплаты в массиве
//    поиск наибольшей зарплаты в массиве
//    поиск наименьшего количества подчиненных в массиве менеджеров
//    поиск наибольшего количества подчиненных в массиве менеджеров
//    поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров
//    поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой) в массиве менеджеров

    public static int findByName(String name, Employee [] arr){
        for(int i = 0; i < arr.length; i++){
            if(name.equals(arr[i].getName())){
                return i;
            }
        }

        return -1;
    }

    public int findBySubName(String subName, Employee [] arr){
        for(int i = 0; i < arr.length; i++){
            if(arr[i].getName().contains(subName)){
                return i;
            }
        }

        return -1;
    }
// For code below (lines 37 - 43 inclusive): Sergey used Worker (to get salarySum for workers)
// and said Manager could be used too (for getting salarySum for managers).
// This was done because Employee didn't have the method required and
// because we (at that moment) didn't know about 'super' yet.

    public int salarySum(Worker [] arr){
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            result += arr[i].getSalaryWorker();
            }
        return result;
        }

// comments (lines: 34 - 37) are applicable to the code  (lines: 49 - 55) too. N.B. Sergey didn't provide
// a code for minSalary, minNumberOfEmployees, maxNumberOfEmployees, maxIncrement, minIncrement
// so don't look for the code for those here please ;)

    public int findMaxSalary(Worker [] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if (max < arr[i].getSalaryWorker()){
                max = arr[i].getSalaryWorker();
            }
        }
        return max;
    }
}

