public class largestnumber {
    public static int find(int number[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<number.length;i++){
            if (largest < number[i]){
                largest = number[i];
            }
            if (smallest > number[i] ){
                smallest = number[i];
            }

        }
        System.out.println("smallest value is:"+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int number[] = {34,65,21,45,87,64,43,22,11};

        System.out.println("largest value is:"+find(number));


    }
}
