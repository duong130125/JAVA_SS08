public class BT04 {
    public static void main(String[] args) {
        String initialString = "abcdefghij".repeat(100000); // Chuỗi 1 triệu ký tự

        System.out.println("Testing performance with 1 million characters:\n");

        // Kiểm tra với StringBuilder
        System.out.println("Using StringBuilder:");
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder(initialString);
        sb.reverse();
        long endTime = System.nanoTime();
        System.out.println("Reverse time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        sb.insert(500000, "INSERTED");
        endTime = System.nanoTime();
        System.out.println("Insert time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        sb.delete(400000, 400010);
        endTime = System.nanoTime();
        System.out.println("Delete time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        sb.replace(200000, 200010, "REPLACED");
        endTime = System.nanoTime();
        System.out.println("Replace time: " + (endTime - startTime) / 1e6 + " ms");

        // Kiểm tra với StringBuffer
        System.out.println("\nUsing StringBuffer:");
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer(initialString);
        sbf.reverse();
        endTime = System.nanoTime();
        System.out.println("Reverse time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        sbf.insert(500000, "INSERTED");
        endTime = System.nanoTime();
        System.out.println("Insert time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        sbf.delete(400000, 400010);
        endTime = System.nanoTime();
        System.out.println("Delete time: " + (endTime - startTime) / 1e6 + " ms");

        startTime = System.nanoTime();
        sbf.replace(200000, 200010, "REPLACED");
        endTime = System.nanoTime();
        System.out.println("Replace time: " + (endTime - startTime) / 1e6 + " ms");
    }
}
