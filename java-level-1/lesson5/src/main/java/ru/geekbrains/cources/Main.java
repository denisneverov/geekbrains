package ru.geekbrains.cources;

public class Main {

    public static void main(String[] args) {
        Employee[] employees = getEmployees();

        for (Employee employee : employees) {
            if (employee.age > 40) {
                employee.printToConsole();
            }
        }
    }

    private static Employee[] getEmployees() {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivan Ivanov", "Engineer", "ivivan@mailbox.com", "892312312", 100000, 45);
        employees[1] = new Employee("Vasiliy Petrov", "Junior Engineer", "vasiliy@mailbox.com", "892312312", 30000, 22);
        employees[2] = new Employee("Ivan Pupkin", "Cleaner", "pupkin@mailbox.com", "892312312", 15000, 30);
        employees[3] = new Employee("Alisa Fren", "Accountant", "alias@mailbox.com", "892312312", 45000, 27);
        employees[4] = new Employee("John Smit", "Agent", "john@mailbox.com", "892312312", 200000, 50);

        return employees;
    }
}
