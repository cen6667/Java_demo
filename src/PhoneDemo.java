public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "XiaoMi";
        p.price = 1000;
        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.message();

    }
}
