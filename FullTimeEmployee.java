class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, double salary) {
        super(name);  // เรียกใช้งาน constructor ของคลาสแม่
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary;  // คำนวณเงินเดือนจากเงินเดือนประจำ
    }
}
