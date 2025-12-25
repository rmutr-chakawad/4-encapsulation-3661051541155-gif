public class Account {
    private String code;
    private String name;
    private double balance;

    // constructor method เมธอดถูกเรียกใช้เมื่อ instance object ถูกเรียกใช้เพียงครั้งเดียว
    public Account(String code, String name, double balance){
        // code ของ account
        // this.code คือ Method
        this.code = code;
        this.name = name;
        this.balance = balance;
    }

    // Method set() ต้องเป็น void
    public void setName(String newName){
        this.name = newName;
    }

    public double getBalance(){
        return balance;
    }

    // Method ฝากเงิน (deposit) เงินที่นำฝากจะต้องมีค่ามากกว่า 0
    public void deposit(double coin){
        if (coin > 0){
            balance += coin;
        }
    }

    // Method ถอนเงิน (Withdraw) เงินคงเหลือต้องมีค่ามากกว่าเงินที่ถอน
    // ไม่จำเป็นต้อง Return ค่า
    public void Withdraw(double coin){
        if (balance >= coin){
            balance -= coin;
        }
    }

    public void show(){
        System.out.printf("Code: %s%n",code);
        System.out.printf("Name: %s%n",name);
        System.out.printf("Balance: %,.2f Baht",balance);
    }


}
