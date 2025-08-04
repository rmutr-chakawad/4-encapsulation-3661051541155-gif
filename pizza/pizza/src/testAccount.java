import java.util.Scanner;

public class testAccount {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Put your code :  ");
        String code = keyboard.next();

        System.out.println("Put your name : ");
        String name = keyboard.next();

        System.out.println("Enter initial amount :  ");
        double balance = keyboard.nextDouble();

        Account pantip = new Account(code, name, balance);
        pantip.show();

        // ฝากเงิน 1,000 และแสดงผล
        System.out.println("\nPut deposit coin :  ");
        double coin = keyboard.nextDouble();
        pantip.deposit(coin);
        pantip.show();

        pantip.deposit(1000);
        System.out.println("\nหลังจากฝากเงิน 1,000 บาท: ");
        pantip.show();

        // ถอน 900 และแสดงผล
        pantip.Withdraw(900);
        System.out.println("\nหลังจากถอนเงิน 900 บาท: ");
        pantip.show();
    }
}
