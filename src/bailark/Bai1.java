package bailark;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] mang = new int[100];
        int n = 0;
        boolean tiepTuc = true;

        while (tiepTuc) {
            System.out.println("************** MENU **************");
            System.out.println("1. Nhap gia tri n phan tu cua mang");
            System.out.println("2. In gia tri cac phan tu trong mang");
            System.out.println("3. Tinh trung binh cac phan tu duong");
            System.out.println("4. Tim vi tri cac phan tu co gia tri bang k");
            System.out.println("5. Sap xep mang giam dan (Bubble Sort)");
            System.out.println("6. Dem so nguyen to trong mang");
            System.out.println("7. Sap xep theo yeu cau dac biet");
            System.out.println("8. Chen gia tri m vao mang da sap xep giam dan");
            System.out.println("9. Thoat chuong trinh");
            System.out.print("Chon chuc nang: ");
            int chon = scanner.nextInt();

            switch (chon) {
                case 1:
                    System.out.print("Nhap so luong phan tu: ");
                    n = scanner.nextInt();
                    System.out.println("Nhap cac phan tu: ");
                    for (int i = 0; i < n; i++) {
                        mang[i] = scanner.nextInt();
                    }
                    break;

                case 2:
                    System.out.print("Cac phan tu trong mang: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(mang[i] + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    int tong = 0, count = 0;
                    for (int i = 0; i < n; i++) {
                        if (mang[i] > 0) {
                            tong += mang[i];
                            count++;
                        }
                    }
                    System.out.println("Trung binh cac so duong: " + (count > 0 ? (double) tong / count : 0));
                    break;

                case 4:
                    System.out.print("Nhap gia tri k: ");
                    int k = scanner.nextInt();
                    System.out.print("Vi tri cac phan tu bang k: ");
                    for (int i = 0; i < n; i++) {
                        if (mang[i] == k) System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (mang[j] < mang[j + 1]) {
                                int temp = mang[j];
                                mang[j] = mang[j + 1];
                                mang[j + 1] = temp;
                            }
                        }
                    }
                    System.out.println("Mang sau khi sap xep giam dan: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(mang[i] + " ");
                    }
                    System.out.println();
                    break;

                case 6:
                    int soNguyenTo = 0;
                    for (int i = 0; i < n; i++) {
                        if (mang[i] > 1) {
                            boolean laNT = true;
                            for (int j = 2; j * j <= mang[i]; j++) {
                                if (mang[i] % j == 0) {
                                    laNT = false;
                                    break;
                                }
                            }
                            if (laNT) soNguyenTo++;
                        }
                    }
                    System.out.println("So luong so nguyen to: " + soNguyenTo);
                    break;

                case 7:
                    int[] sapXep = new int[n];
                    int index = 0;
                    for (int i = 0; i < n; i++) {
                        if (mang[i] % 2 == 0 && mang[i] % 3 == 0) sapXep[index++] = mang[i];
                    }
                    for (int i = 0; i < n; i++) {
                        if (mang[i] % 3 != 0) sapXep[index++] = mang[i];
                    }
                    for (int i = 0; i < n; i++) {
                        if (mang[i] % 2 != 0 && mang[i] % 3 == 0) sapXep[index++] = mang[i];
                    }
                    System.out.println("Mang sau khi sap xep: ");
                    for (int i = 0; i < n; i++) {
                        System.out.print(sapXep[i] + " ");
                    }
                    System.out.println();
                    break;

                case 8:
                    System.out.print("Nhap gia tri m: ");
                    int m = scanner.nextInt();
                    int i;
                    for (i = n - 1; i >= 0 && mang[i] < m; i--) {
                        mang[i + 1] = mang[i];
                    }
                    mang[i + 1] = m;
                    n++;
                    System.out.println("Mang sau khi chen m: ");
                    for (i = 0; i < n; i++) {
                        System.out.print(mang[i] + " ");
                    }
                    System.out.println();
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
