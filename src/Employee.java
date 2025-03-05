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




}
