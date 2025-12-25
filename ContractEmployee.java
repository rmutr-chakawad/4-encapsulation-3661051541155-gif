class ContractEmployee extends Employee {
    double hourlyRate;  // อัตราค่าแรงต่อชั่วโมง
    double hoursWorked; // ชั่วโมงทำงาน

    // Constructor
    public ContractEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);  // เรียกใช้งาน constructor ของคลาสแม่
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;  // คำนวณเงินเดือนจากชั่วโมงทำงาน × อัตราค่าแรง
    }
}
