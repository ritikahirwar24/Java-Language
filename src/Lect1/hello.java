 package Lect1;

class Main {
     static void main(String[] args) {
        // Output pattern:
        // 5
        // 55
        // 555
        // 5555

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("5");
            }
            System.out.println();
        }

        // --- Other examples (for your reference) ---

        // Example 1: Type casting
        // int a = 5;
        // short b = (short) a;
        // System.out.println(b);

        // Example 2: Even-odd check
        // int a = 5;
        // if (a % 2 == 0) {
        //     System.out.println("even");
        // } else {
        //     System.out.println("odd");
        // }

        // Example 3: Simple for loop
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(i);
        // }
    }
}
