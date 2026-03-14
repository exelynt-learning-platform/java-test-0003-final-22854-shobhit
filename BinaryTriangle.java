public class BinaryTriangle {
    private static final int ROWS = 6;

    public static void main(String[] args) {
        for (int i = 1; i <= ROWS; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
