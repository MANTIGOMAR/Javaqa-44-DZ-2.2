public class Main {
    public static void main(String[] args) {
        int num1 = 150;
        int num2 = 20;
        if (num2 >= 1000) {
            System.out.println(num1 + num2 / 100 + num2);
            System.out.println("рублей на счету с учетом бонусов");
        } else if (num2 < 1000) {
            System.out.println(num1 + num2);
            System.out.println("рублей на счету");
        }
    }
}
