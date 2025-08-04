package apack;

public class ASamPack {
    public static void main(String[] args) {
        A as = new A();
        as.print();
        as.defaultAttribute = 70;
        as.protectedAttribute = 90;
        as.publicAttribute = 100;
    /*  as.privateAttribute = 25; error private no access
        เพราะเป็น private ใช้ได้เพียงใน class เท่านั้น เข้าถึงไม่ได้เลย
    */
        as.print();
    }
}
