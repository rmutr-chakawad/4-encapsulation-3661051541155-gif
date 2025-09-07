public class TestEmployee {
    public static void main(String[] args) {
        // สร้างพนักงานประเภท FullTime
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("John Doe", 50000);

        // สร้างพนักงานประเภท Contract
        ContractEmployee contractEmployee = new ContractEmployee("Jane Smith", 300, 160); // อัตราค่าแรง 300, ชั่วโมงทำงาน 160

        // แสดงผลรวมเงินเดือน
        System.out.println("Full-Time Employee:");
        fullTimeEmployee.showSalary();

        System.out.println("Contract Employee:");
        contractEmployee.showSalary();
    }
}
