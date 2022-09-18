public class Main {
    public static void main(String[] args) {
        int check = 150;
        int enroll = 999;
        if (enroll >= 1000) {
            System.out.println(check + enroll / 100 + enroll);
            System.out.println("рублей на счету с учетом бонусов");
        } else if (enroll < 1000) {
            System.out.println(check + enroll);
            System.out.println("рублей на счету");
        }
    }
}
