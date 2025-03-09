import java.util.Scanner;

public class BT02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Nhập kích thước của mảng: ");
            while (!sc.hasNextInt()) {
                System.out.println("Kích thước không hợp lệ. Vui lòng nhập lại.");
                sc.next(); // Xóa bộ nhớ đệm
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

        int sum = 0;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                found = true;
            }
        }

        if (found) {
            System.out.println("Tổng các số chia hết cho 3: " + sum);
        } else {
            System.out.println("Không có số chia hết cho 3.");
        }
    }
}
