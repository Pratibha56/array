public class array {
    public static void main(String[] args) {
        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        /*
         * int total = 0;
         * for (int i = 0; i < arr.length; i++) {
         * System.out.print(i);
         * total++;
         * }
         * System.out.println();
         * System.out.println("total  "+total);
         */

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

}