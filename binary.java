import java.util.*;

public class binary {
    public static int search(int number[], int key) {

        int start = 0, end = number.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key){
                start = mid + 1;

            }
            else{
                end = mid - 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 5, 7, 9, 11, 23, 45 };
        int key = 9;

        System.out.println("index:" + search(number, key));

    }

}
