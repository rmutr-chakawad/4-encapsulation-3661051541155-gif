abstract class Employee {
    String name;
    double salary;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Abstract method สำหรับการคำนวณเงินเดือน
    abstract double calculateSalary();

    // Method แสดงชื่อและเงินเดือน
    public void showSalary() {
        System.out.println("Name: " + name + ", Salary: " + calculateSalary());
    }
}


