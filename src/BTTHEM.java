import java.util.Scanner;

public class BTTHEM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----------MENU----------");
            System.out.println("1. Thêm phần tử vào mảng");
            System.out.println("2. Cập nhật phần tử trong mảng");
            System.out.println("3. Xóa phần tử trong mảng");
            System.out.println("4. Thoát chương trình");
            System.out.printf("Nhập độ dài của mảng: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.printf("Nhập lựa chọn của bạn: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("Nhập giá trị muốn thêm vào mảng: ");
                    int m = sc.nextInt();
                    System.out.printf("Nhập vị trí muốn thêm: ");
                    int t = sc.nextInt();
                    int[] arr2 = new int[n + 1];

                    if (t < 0) {
                        System.out.println("Không tồn tại chỉ số " + t);
                    } else if (t < n) {
                        for (int i = 0; i < (n + 1); i++) {
                            if (i < t) {
                                arr2[i] = arr[i];
                            } else if (i == t) {
                                arr2[i] = m;
                            } else {
                                arr2[i] = arr[i - 1];
                            }
                        }
                    } else {
                        arr2 = new int[t + 1];
                        for (int i = 0; i < n; i++) {
                            arr2[i] = arr[i];
                        }
                        for (int i = 0; i < arr2.length; i++) {
                            if (i == t) {
                                arr2[i] = m;
                            }
                        }
                    }

                    for (int i = 0; i < arr2.length; i++) {
                        System.out.println(arr2[i] + " ");
                    }
                    break;

                case 2:
                    System.out.printf("Nhập giá trị phần tử muốn cập nhật: ");
                    int x = sc.nextInt();
                    System.out.printf("Nhập giá trị mới: ");
                    int y = sc.nextInt();

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == x) {
                            arr[i] = y;
                        }
                    }

                    for (int i = 0; i < arr.length; i++) {
                        System.out.println(arr[i] + " ");
                    }
                    break;

                case 3:
                    System.out.println("Nhập phần tử muốn xóa: ");
                    x = sc.nextInt();
                    int count = 0;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] == x) {
                            count++;
                        }
                    }

                    if (count == 0) {
                        System.out.println("Phần tử không tồn tại trong mảng.");
                        break;
                    }

                    int[] arr3 = new int[n - count];
                    int index = 0;

                    for (int i = 0; i < n; i++) {
                        if (arr[i] != x) {
                            arr3[index] = arr[i];
                            index++;
                        }
                    }

                    for (int i = 0; i < arr3.length; i++) {
                        System.out.print(arr3[i] + " ");
                    }
                    System.out.println();
                    break;
                default:
                    System.out.println("Thoát chương trình");
                    return;
            }
        } while (true);
    }
}
