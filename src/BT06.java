import java.util.Scanner;

public class BT06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mainChoice;
        String inputString = "";
        int[] array = null;

        do {
            System.out.println("===== MENU CHÍNH =====");
            System.out.println("1. Xử lý chuỗi");
            System.out.println("2. Xử lý số nguyên");
            System.out.println("3. Thoát chương trình");
            System.out.print("Chọn chức năng (1-3): ");
            mainChoice = scanner.nextInt();
            scanner.nextLine();

            switch (mainChoice) {
                case 1:
                    int stringChoice;
                    do {
                        System.out.println("\n===== MENU XỬ LÝ CHUỖI =====");
                        System.out.println("1. Nhập chuỗi");
                        System.out.println("2. Loại bỏ khoảng trắng thừa");
                        System.out.println("3. Đếm số lần xuất hiện của từng ký tự");
                        System.out.println("4. Chuyển đổi chuỗi thành dạng chuẩn");
                        System.out.println("5. Quay lại menu chính");
                        System.out.print("Chọn chức năng (1-5): ");
                        stringChoice = scanner.nextInt();
                        scanner.nextLine();

                        switch (stringChoice) {
                            case 1:
                                System.out.print("Nhập chuỗi: ");
                                inputString = scanner.nextLine();
                                break;
                            case 2:
                                if (!inputString.isEmpty()) {
                                    inputString = inputString.trim().replaceAll("\\s+", " ");
                                    System.out.println("Chuỗi sau khi loại bỏ khoảng trắng: " + inputString);
                                } else {
                                    System.out.println("Vui lòng nhập chuỗi trước.");
                                }
                                break;
                            case 3:
                                if (!inputString.isEmpty()) {
                                    int[] count = new int[256];
                                    for (char c : inputString.toCharArray()) count[c]++;
                                    for (int i = 0; i < 256; i++) {
                                        if (count[i] > 0) System.out.println((char) i + ": " + count[i]);
                                    }
                                } else {
                                    System.out.println("Vui lòng nhập chuỗi trước.");
                                }
                                break;
                            case 4:
                                if (!inputString.isEmpty()) {
                                    String[] words = inputString.toLowerCase().split(" ");
                                    String result = "";
                                    for (String word : words) {
                                        if (!word.isEmpty()) {
                                            result += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
                                        }
                                    }
                                    inputString = result.trim();
                                    System.out.println("Chuỗi sau khi chuẩn hóa: " + inputString);
                                } else {
                                    System.out.println("Vui lòng nhập chuỗi trước.");
                                }
                                break;
                            case 5:
                                System.out.println("Quay lại menu chính.");
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ.");
                        }
                    } while (stringChoice != 5);
                    break;

                case 2:
                    int numberChoice;
                    do {
                        System.out.println("\n===== MENU XỬ LÝ MẢNG SỐ NGUYÊN =====");
                        System.out.println("1. Nhập mảng");
                        System.out.println("2. Tìm số nguyên tố lớn nhất");
                        System.out.println("3. Đếm phần tử có chữ số đầu lẻ");
                        System.out.println("4. Kiểm tra mảng đối xứng");
                        System.out.println("5. Quay lại menu chính");
                        System.out.print("Chọn chức năng (1-5): ");
                        numberChoice = scanner.nextInt();

                        switch (numberChoice) {
                            case 1:
                                System.out.print("Nhập số lượng phần tử: ");
                                int n = scanner.nextInt();
                                array = new int[n];
                                for (int i = 0; i < n; i++) {
                                    System.out.print("Nhập phần tử " + (i + 1) + ": ");
                                    array[i] = scanner.nextInt();
                                }
                                break;
                            case 2:
                                if (array != null) {
                                    int largestPrime = -1;
                                    for (int num : array) {
                                        boolean isPrime = true;
                                        if (num < 2) isPrime = false;
                                        for (int i = 2; i * i <= num; i++) {
                                            if (num % i == 0) {
                                                isPrime = false;
                                                break;
                                            }
                                        }
                                        if (isPrime && num > largestPrime) {
                                            largestPrime = num;
                                        }
                                    }
                                    System.out.println(largestPrime != -1 ? "Số nguyên tố lớn nhất: " + largestPrime : "Không có số nguyên tố.");
                                } else {
                                    System.out.println("Vui lòng nhập mảng trước.");
                                }
                                break;
                            case 3:
                                if (array != null) {
                                    int count = 0;
                                    for (int num : array) {
                                        int firstDigit = Integer.parseInt(Integer.toString(Math.abs(num)).substring(0, 1));
                                        if (firstDigit % 2 != 0) count++;
                                    }
                                    System.out.println("Số phần tử có chữ số đầu lẻ: " + count);
                                } else {
                                    System.out.println("Vui lòng nhập mảng trước.");
                                }
                                break;
                            case 4:
                                if (array != null) {
                                    boolean isPalindrome = true;
                                    for (int i = 0, j = array.length - 1; i < j; i++, j--) {
                                        if (array[i] != array[j]) {
                                            isPalindrome = false;
                                            break;
                                        }
                                    }
                                    System.out.println(isPalindrome ? "Mảng đối xứng." : "Mảng không đối xứng.");
                                } else {
                                    System.out.println("Vui lòng nhập mảng trước.");
                                }
                                break;
                            case 5:
                                System.out.println("Quay lại menu chính.");
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ.");
                        }
                    } while (numberChoice != 5);
                    break;

                case 3:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại!");
            }
        } while (mainChoice != 3);
    }
}
