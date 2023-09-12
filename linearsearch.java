public class linearsearch {

    public static int searchindex(int number[], int key) {

        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int number[] = { 2, 8, 4, 65, 88, 55, 46, 9 };
        int key = 55;
        int index = searchindex(number, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("index " + index);
        }
    }
}
