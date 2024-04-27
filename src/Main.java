public class Main {
    public static void main(String[] args) {
        int n = 43; // Число n должно быть нечетным
        drawPattern(n);
    }

    public static void drawPattern(int n) {
        int mid = n / 2;
        int stars = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - stars) / 2; j++) {
                System.out.print("-");
            }

            for (int k = 0; k < stars; k++) {
                System.out.print("*");
            }

            for (int j = 0; j < (n - stars) / 2; j++) {
                System.out.print("-");
            }

            System.out.println();

            if (i < mid) {
                stars += 2;
            } else {
                stars -= 2;
            }
        }
    }
}