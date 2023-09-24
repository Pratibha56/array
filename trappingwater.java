public class trappingwater {
    public static int volume(int number[]) {
        int n = number.length;
        // left max boundary array
        int left[] = new int[n];
        left[0] = number[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(number[i], left[i - 1]);

        }
        // right max boundary array

        int right[] = new int[n];
        right[n-1]=number[n-1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(number[i], right[i + 1]);

        }

        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(left[i], right[i]);
            trappedwater = trappedwater + waterlevel - number[i];
        }
        return trappedwater;

    }

    public static void main(String[] args) {
        int number[] = { 4, 2, 0, 6, 3, 5 };
        //volume(number);
        System.out.println(volume(number));
    }

}
