public class Main {
    public static void main(String[] args) {
        int check = 150;
        int enroll = 1002;
        if (enroll > 1000) {
            System.out.println(check + enroll / 100 + enroll + "рублей еа счете," );
            System.out.println("начисленных бонусов  " + enroll / 100);
        } else {
            System.out.println(check + enroll + "рублей на счете, начисленных бонусов  0");
        }
    }
}
