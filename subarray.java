public class subarray {

    public static void printsubaaray(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k] + " ");
                    sum = sum + number[k];
                }
                System.out.println("=> sum:" + sum);
                tp++;

                System.out.println();

            }

            System.out.println();
            // sum = number[i]+number[j]+number[k];
        }

        System.out.println("total subarrays =" + tp);

        int minsum = Integer.MAX_VALUE;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            int sum = 0;
            for (int j = i; j < number.length; j++) {
                sum = sum + number[j];
                // comapare
                minsum = Math.min(minsum, sum);
                maxsum = Math.max(maxsum, sum);
            }
        }
        System.out.println("minimum sum of subarray : " + minsum);
        System.out.println("Maximum sum of subarrays : " + maxsum);

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        printsubaaray(number);
    }

}
