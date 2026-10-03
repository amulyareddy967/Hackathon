import java.util.Scanner;

class WaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int litres = sc.nextInt();

        if (litres <= 500) {
            System.out.println("Bill: Rs.100");
        } else {
            System.out.println("Bill: Rs.200");
        }
    }
}