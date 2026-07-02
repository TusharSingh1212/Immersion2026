public class Second_Largest{
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 1, 4, 2, 3};
        int largest = Integer.MIN_VALUE;
        if(arr.length<=1){
            System.out.println("Too short to have second largest");
        }
        else{
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > largest) {
                    largest = arr[i];
                }
            }
            int secondLargest = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] > secondLargest && arr[i] < largest) {
                    secondLargest = arr[i];
                }
            }
            System.out.println(secondLargest);
        }
    }
}
/**/