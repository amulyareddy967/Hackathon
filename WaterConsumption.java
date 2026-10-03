import java.util.Scanner;

class WaterConsumption {
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int morning = sc.nextInt();
        int evening = sc.nextInt();

        int total = calculateTotal(morning, evening);
        System.out.println("Total Consumption: " + total);
    }
}