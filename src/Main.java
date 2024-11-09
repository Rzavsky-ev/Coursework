
public class Main {

    public static void main(String[] args) {

        EmployeeBook skyPro = new EmployeeBook();

        //////////////////////////////Добавление сотрудников в список///////////////////////////////////////////////////

        skyPro.addEmployee("Петров Петр Петрович", 1000, 1);
        skyPro.addEmployee("Иванов Иван Иванович", 2000,
                2);
        skyPro.addEmployee("Сидоров Сидр Сидорович", 300, 3);
        skyPro.addEmployee("Александров Александр Александрович", 4000,
                4);
        skyPro.addEmployee("Семенов Семен Семенович", 5000, 5);
        skyPro.addEmployee("Сергеев Сергей Сергеевич", 100, 1);
        skyPro.addEmployee("Викторов Виктор Викторович", 2000, 2);
        skyPro.addEmployee("Васильев Василий Васильевич", 300, 3);
        skyPro.addEmployee("Кирилов Кирил Кирилович", 4000, 4);

        //////////////////////////////Проверка методов///////////////////////////////////////////////////

        //Получение всех данных в строку
        System.out.println(skyPro.toStringAllData());

        //Вычисление зарплаты всех сотрудников
        System.out.println("Сумма всей зарплаты:" + skyPro.calculateTotalSalary());
        System.out.println();

        //Поиск сотрудника с мин зп
        System.out.println("Минимальная зарплата:" +
                skyPro.findEmployeeMinimumSalary().getSurnameNamePatronymic());
        System.out.println();

        //Поиск сотрудника с макс зп
        System.out.println("Максимальная зарплата:" +
                skyPro.findEmployeeMaximumSalary().getSurnameNamePatronymic());
        System.out.println();

        //Вычисление средней зп
        System.out.println("Величина средней зарплаты:" + skyPro.calculateAverageValueSalaries());
        System.out.println();

        //Печать ФИО
        skyPro.PrintFullName();
        System.out.println();

        //Индексация ЗП
        skyPro.indexSalary(10);
        System.out.println();

        //Поиск сотрудника с мин ЗП в отделе
        System.out.println("Минимальная зарплата в отделе:" +
                skyPro.findMinimumSalaryDepartment(1).getSurnameNamePatronymic());
        System.out.println();

        //Поиск сотрудника с макс ЗП в отделе
        System.out.println("Максимальная зарплата в отделе:" +
                skyPro.findMaximumSalaryDepartment(1).getSurnameNamePatronymic());
        System.out.println();

        //Сумма ЗП по отделу
        System.out.println("Сумма зарплат в отделе:" + skyPro.calculatingAmountExpensesDepartment(1));
        System.out.println();

        //Средняя ЗП по отделу
        System.out.println("Средняя зарплата в отделе:" + skyPro.calculatingAverageCostDepartment(1));
        System.out.println();

        //Индексация зарплаты в отделе
        skyPro.indexSalaryInDepartment(2, 10);
        System.out.println();

        //Печать данных сотрудников отдела
        skyPro.printDataDepartmentEmployees(3);
        System.out.println();

        //Печать данных сотрудников с ЗП меньше
        skyPro.printingEmployeeDataWithSalaryLower(500);
        System.out.println();

        //Печать данных сотрудников с ЗП больше
        skyPro.printingEmployeeDataWithHigherSalary(500);
        System.out.println();

        //Поиск сотрудника по id
        System.out.println("Сотрудник с id:" + skyPro.getEmployeeId(2).getSurnameNamePatronymic());

        //Удаление сотрудника
        skyPro.removeEmployee(3);
    }
}



