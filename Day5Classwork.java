public class Day5Classwork {
    public static void main(String[] args) {
        int a[] = {82, 98, 36, 67, 55};

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 90) {
                System.out.println(a[i] + " - Excellent");
            } else if (a[i] >= 75) {
                System.out.println(a[i] + " - Good");
            } else if (a[i] >= 50) {
                System.out.println(a[i] + " - Average");
            } else {
                System.out.println(a[i] + " - Fail");
            }
        }
    }
}
