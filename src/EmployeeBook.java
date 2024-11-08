class EmployeeBook {
    private Employee[] employees = new Employee[10];

    //Получение всех данных в строку
    public String toStringAllData() {
        String result = "";
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            result += "ФИО:" + employee.getSurnameNamePatronymic() + ". Hомер отдела:" + employee.getEmployeeDepartment() + ". Велечина зарплаты:" + employee.getSalaryAmount() + ". id:" + employee.getId() + " \n";
        }
        return result;
    }

    //Вычисление зарплаты всех сотрудников
    public int calculateTotalSalary() {
        int total = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            total += employee.getSalaryAmount();
        }
        return total;
    }

    //Поиск сотрудника с мин зп
    public Employee findEmployeeMinimumSalary() {
        Employee person = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalaryAmount() < person.getSalaryAmount()) {
                person = employee;
            }
        }
        return person;
    }

    //Поиск сотрудника с макс зп
    public Employee findEmployeeMaximumSalary() {
        Employee person = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalaryAmount() > person.getSalaryAmount()) {
                person = employee;
            }
        }
        return person;
    }

    //Вычисление средней зп
    public double calculateAverageValueSalaries() {
        return (double) calculateTotalSalary() / (double) employees.length;

    }

    //Печать ФИО
    public void PrintFullName() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getSurnameNamePatronymic());
        }
    }

    //Индексация ЗП
    public void indexSalary(int indexationPercentage) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            employee.setSalaryAmount(employee.getSalaryAmount()
                    + (employee.getSalaryAmount() * indexationPercentage / 100));
        }
    }

    //Поиск сотрудника с мин ЗП в отделе
    public Employee findMinimumSalaryDepartment(int departmentNumber) {
        Employee person = null;
        for (Employee employee : employees) {
            if (employee.getEmployeeDepartment() == departmentNumber) {
                person = employee;
                break;
            }
        }
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getEmployeeDepartment() == departmentNumber &&
                    employee.getSalaryAmount() < person.getSalaryAmount()) {
                person = employee;
            }
        }
        return person;
    }

    //Поиск сотрудника с макс ЗП в отделе
    public Employee findMaximumSalaryDepartment(int departmentNumber) {
        Employee person = null;
        for (Employee employee : employees) {

            if (employee.getEmployeeDepartment() == departmentNumber) {
                person = employee;
                break;
            }
        }
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getEmployeeDepartment() == departmentNumber &&
                    employee.getSalaryAmount() > person.getSalaryAmount()) {
                person = employee;
            }
        }
        return person;
    }

    //Сумма ЗП по отделу
    public int calculatingAmountExpensesDepartment(int departmentNumber) {
        int total = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getEmployeeDepartment() == departmentNumber) {
                total += employee.getSalaryAmount();
            }
        }
        return total;
    }

    //Средняя ЗП по отделу
    public double calculatingAverageCostDepartment(int departmentNumber) {
        int total = 0;
        int counter = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getEmployeeDepartment() == departmentNumber) {
                total += employee.getSalaryAmount();
                counter++;
            }
        }
        return (double) total / (double) counter;
    }

    //Индексация зарплаты в отделе
    public void indexSalaryInDepartment(int departmentNumber, int indexationPercentage) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getEmployeeDepartment() == departmentNumber) {
                employee.setSalaryAmount(employee.getSalaryAmount()
                        + (employee.getSalaryAmount() * indexationPercentage / 100));
            }
        }
    }

    //Печать данных сотрудников отдела
    public void PrintDataDepartmentEmployees(int departmentNumber) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getEmployeeDepartment() == departmentNumber) {
                System.out.println("ФИО:" + employee.getSurnameNamePatronymic() + ". Сумма зарплаты:" +
                        employee.getSalaryAmount() + ". id:" + employee.getId() + ".");
            }
        }
    }

    //Печать данных сотрудников с ЗП меньше
    public void printingEmployeeDataWithSalaryLower(int limit) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalaryAmount() < limit) {
                System.out.println("id:" + employee.getId() + ". ФИО:" + employee.getSurnameNamePatronymic() +
                        ". Сумма зарплаты:" + employee.getSalaryAmount());
            }
        }
    }

    //Печать данных сотрудников с ЗП больше
    public void printingEmployeeDataWithHigherSalary(int limit) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalaryAmount() > limit) {
                System.out.println("id:" + employee.getId() + ". ФИО:" + employee.getSurnameNamePatronymic() +
                        ". Сумма зарплаты:" + employee.getSalaryAmount());
            }
        }
    }

    //Добавления сотрудника
    public boolean addEmployee(String surnameNamePatronymic, int salaryAmount, int namesDepartment) {
        boolean flag = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(surnameNamePatronymic, salaryAmount, namesDepartment);
                flag = true;
                break;
            }
        }
        return flag;
    }

    //Удаление сотрудника
    public void removeEmployee(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getId() == id) {
                employees[i] = null;
            }
        }
    }

    //Поиск сотрудника по id
    public Employee getEmployeeId(int id) {
        Employee person = null;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getId() == id) {
                person = employee;
            }
        }
        return person;
    }

}


