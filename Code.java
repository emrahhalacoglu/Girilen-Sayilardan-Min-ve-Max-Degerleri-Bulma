import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input N : ");
        int n = input.nextInt();

        System.out.print("Input n" + 1 + " : ");
        int n1 = input.nextInt();
        int nlow = n1, nhigh = n1;
        for (int i = 2; i <= n; i++) {
            System.out.print("Input n" + i + " : ");
            int ni = input.nextInt();
            if (ni <= nlow) {
                nlow = ni;
            }
            if (ni >= nhigh) {
                nhigh = ni;
            }
        }
        System.out.println("Highest n Value : " + nhigh);
        System.out.println("Lowest n Value : " + nlow);
    }

}
