public class Main {
    public static void main(String[] args) {
        int num1 = 150;
        int num2 = 5000;
        if (num2 >= 1000) {
            System.out.println(num1 + num2 / 100 + num2);
        } else if (num2 < 1000) {
            System.out.println(num1 + num2);
        }
    }
}
