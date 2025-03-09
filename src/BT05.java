import java.util.Scanner;

public class BT05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = null;
        int choice;

        do {
            System.out.println("*********************** MENU ***********************");
            System.out.println("1. Nhập giá trị `n` phần tử của mảng (`n` nhập từ bàn phím)");
            System.out.println("2. In giá trị các phần tử trong mảng");
            System.out.println("3. Tính trung bình các phần tử dương (`>0`) trong mảng");
            System.out.println("4. In ra vị trí (chỉ số) các phần tử có giá trị bằng `k` trong mảng (`k` nhập từ bàn phím)");
            System.out.println("5. Tính số lượng các phần tử là **số nguyên tố** trong mảng");
            System.out.println("6. Thoát chương trình");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng phần tử của mảng: ");
                    int n = scanner.nextInt();
                    array = new int[n];

                    for (int i = 0; i < array.length; i++) {
                        System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
                        array[i] = scanner.nextInt();
                    }
                    System.out.println("Đã nhập mảng thành công!");
                    break;

                case 2:
                    if (array != null) {
                        System.out.print("Các phần tử trong mảng: ");
                        for (int i = 0; i < array.length; i++) {
                            System.out.print(array[i]);
                            if (i < array.length - 1) {
                                System.out.print(", ");
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.println("Vui lòng nhập mảng trước (lựa chọn 1).");
                    }
                    break;

                case 3:
                    if (array != null) {
                        int sum = 0;
                        int count = 0;

                        for (int i = 0; i < array.length; i++) {
                            if (array[i] > 0) {
                                sum += array[i];
                                count++;
                            }
                        }

                        double average = (count == 0) ? 0 : (double) sum / count;
                        System.out.println("Trung bình các phần tử dương trong mảng: " + average);
                    } else {
                        System.out.println("Vui lòng nhập mảng trước (lựa chọn 1).");
                    }
                    break;

                case 4:
                    if (array != null) {
                        System.out.print("Nhập giá trị k: ");
                        int k = scanner.nextInt();

                        System.out.print("Vị trí các phần tử có giá trị " + k + " trong mảng: ");
                        boolean found = false;

                        for (int i = 0; i < array.length; i++) {
                            if (array[i] == k) {
                                System.out.print(i + " ");
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.print("Không tìm thấy");
                        }

                        System.out.println();
                    } else {
                        System.out.println("Vui lòng nhập mảng trước (lựa chọn 1).");
                    }
                    break;

                case 5:
                    if (array != null) {
                        int primeCount = 0;

                        for (int i = 0; i < array.length; i++) {
                            int num = array[i];
                            boolean isPrime = true;

                            if (num <= 1) {
                                isPrime = false;
                            } else {
                                for (int j = 2; j * j <= num; j++) {
                                    if (num % j == 0) {
                                        isPrime = false;
                                        break;
                                    }
                                }
                            }

                            if (isPrime) {
                                primeCount++;
                            }
                        }

                        System.out.println("Số lượng các phần tử là số nguyên tố trong mảng: " + primeCount);
                    } else {
                        System.out.println("Vui lòng nhập mảng trước (lựa chọn 1).");
                    }
                    break;

                case 6:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }

            System.out.println();
        } while (choice != 6);

    }
}
