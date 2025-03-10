package bailark;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hang n: ");
        int n = scanner.nextInt();
        System.out.print("Nhap so cot m: ");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        boolean tiepTuc = true;

        while (tiepTuc) {
            System.out.println("************** MENU **************");
            System.out.println("1. Nhap gia tri cac phan tu cua mang");
            System.out.println("2. In gia tri cac phan tu trong mang theo ma tran");
            System.out.println("3. Tinh so luong cac phan tu chia het cho 2 va 3 trong mang");
            System.out.println("4. In cac phan tu va tong cac phan tu nam tren duong bien, duong cheo chinh va duong cheo phu");
            System.out.println("5. Sap xep tang dan theo cot cua mang");
            System.out.println("6. In ra cac phan tu la so nguyen to trong mang");
            System.out.println("7. Sap xep cac phan tu tren duong cheo chinh giam dan");
            System.out.println("8. Chen mang 1 chieu vao mang 2 chieu");
            System.out.println("9. Thoat");
            System.out.print("Chon chuc nang: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    System.out.println("Nhap cac phan tu cua mang:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            arr[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Mang da nhap:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int count = 0;
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (arr[i][j] % 2 == 0 && arr[i][j] % 3 == 0) {
                                count++;
                            }
                        }
                    }
                    System.out.println("So luong phan tu chia het cho 2 va 3: " + count);
                    break;
                case 4:
                    int tong = 0;
                    System.out.println("Cac phan tu tren duong bien, duong cheo chinh va duong cheo phu:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (i == 0 || j == 0 || i == n - 1 || j == m - 1 || i == j || i + j == n - 1) {
                                System.out.print(arr[i][j] + " ");
                                tong += arr[i][j];
                            }
                        }
                    }
                    System.out.println("\nTong: " + tong);
                    break;
                case 5:
                    for (int j = 0; j < m; j++) {
                        for (int i = 0; i < n - 1; i++) {
                            for (int k = i + 1; k < n; k++) {
                                if (arr[i][j] > arr[k][j]) {
                                    int temp = arr[i][j];
                                    arr[i][j] = arr[k][j];
                                    arr[k][j] = temp;
                                }
                            }
                        }
                    }
                    System.out.println("Mang sau khi sap xep tang dan theo cot:");
                    break;
                case 6:
                    System.out.println("Cac so nguyen to trong mang:");
                    for (int i = 0; i < n; i++) {
                        for (int j = 0; j < m; j++) {
                            if (arr[i][j] > 1) {
                                boolean laNT = true;
                                for (int k = 2; k * k <= arr[i][j]; k++) {
                                    if (arr[i][j] % k == 0) {
                                        laNT = false;
                                        break;
                                    }
                                }
                                if (laNT) System.out.print(arr[i][j] + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case 7:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (arr[i][i] < arr[j][j]) {
                                int temp = arr[i][i];
                                arr[i][i] = arr[j][j];
                                arr[j][j] = temp;
                            }
                        }
                    }
                    System.out.println("Mang sau khi sap xep duong cheo chinh giam dan:");
                    break;
                case 8:
                    System.out.print("Nhap mang 1 chieu gom " + m + " phan tu: ");
                    int[] mang1Chieu = new int[m];
                    for (int i = 0; i < m; i++) {
                        mang1Chieu[i] = scanner.nextInt();
                    }
                    System.out.print("Nhap chi so dong muon chen: ");
                    int row = scanner.nextInt();
                    if (row >= 0 && row < n) {
                        for (int j = 0; j < m; j++) {
                            arr[row][j] = mang1Chieu[j];
                        }
                    }
                    System.out.println("Mang sau khi chen:");
                    break;
                case 9:
                    tiepTuc = false;
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        }
        scanner.close();
    }
}
