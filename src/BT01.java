import java.util.Scanner;

public class BT01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập kích thước của mảng: ");
            while (!sc.hasNextInt()) {
                System.out.println("Kích thước không hợp lệ. Vui lòng nhập lại.");
                sc.next();
            }
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("Kích thước không hợp lệ. Vui lòng nhập lại.");
            }
        } while (n <= 0);

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0], max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất: " + min);
        System.out.println("Giá trị lớn nhất: " + max);
    }
}
