import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (check(nhap())) System.out.println("Nam nhuan");
        else System.out.println("Khong phai nam nhuan");
    }

    static int nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap nam bat ki: ");
        int n = scanner.nextInt();
        return n;
    }

    static boolean check(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
