/*
Design an Employee Salary system using method overriding:

- Base class Employee has method calculateSalary()
- Derived class Manager overrides it and adds bonus
- Use super keyword to call base salary
- Display final salary
*/

class Employee {
    int salary = 30000;
    void calculateSalary() {
        System.out.println("base Salary " + salary);
    }
}

class Manager extends Employee {
    int bonus = 10000;
    void calculateSalary() {
        super.calculateSalary();
        int total = salary + bonus;
        System.out.println("manager total salary " + total);
    }
}
class Overidding1 {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.calculateSalary();
    }
}


