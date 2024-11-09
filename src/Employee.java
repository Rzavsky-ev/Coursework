import java.util.Objects;

public class Employee {

    public Employee(String surnameNamePatronymic, int salaryAmount, int departmentNumber) {
        this.surnameNamePatronymic = surnameNamePatronymic;
        this.salaryAmount = salaryAmount;
        employeeDepartment = departmentNumber;
        this.id = idCounter++;
    }

    private String surnameNamePatronymic;
    private int employeeDepartment;
    private int salaryAmount;
    private static int idCounter = 1; // статический счетчик для id
    private int id;

    public String getSurnameNamePatronymic() {
        return surnameNamePatronymic;
    }

    public int getEmployeeDepartment() {
        return employeeDepartment;
    }

    public int getSalaryAmount() {
        return salaryAmount;
    }

    public int getId() {
        return id;
    }

    public void setSalaryAmount(int salaryAmount) {
        this.salaryAmount = salaryAmount;
    }

    public void setEmployeeDepartment(int departmentNumber) {
        employeeDepartment = departmentNumber;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверка на null
        if (obj == null) {
            return false;
        }
        // Проверка на тип
        if (!(obj instanceof Employee)) {
            return false;
        }
        // Приведение к типу Person
        Employee other = (Employee) obj;
        // Сравнение полей
        if (!this.surnameNamePatronymic.equals(other.surnameNamePatronymic)) {
            return false;
        }
        if (this.employeeDepartment != other.employeeDepartment) {
            return false;
        }
        if (this.salaryAmount != other.salaryAmount) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {

        int result;
        if (surnameNamePatronymic == null) {
            result = 0;
        } else {
            result = surnameNamePatronymic.hashCode();
        }
        result += employeeDepartment;
        result += salaryAmount;
        result += id;
        return result;
    }


    /*
     Создать класс Employee, который содержит информацию о ФИО, отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
 Добавить статическую переменную-счетчик, которая будет отвечать за id.
 Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.
 Скрыть прямой доступ к полям класса Employee и добавить возможность получать значения полей (геттеры) и устанавливать значения полей отдела и зарплаты (сеттеры).
 Реализовать в классе Employee контракты equals и hashCode.
 По-умолчанию все поля должны передаваться через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
 Создать внутри класса Main метод main и поле типа Employee[10], которое будет выполнять роль "хранилища" для записей о сотрудниках.
     */

}
