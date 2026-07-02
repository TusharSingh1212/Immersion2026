public class Two_sum_II {
    public static void main(String[] args) {
        int[] num={2, 7, 11, 15};
        int target=9;
        for(int i=0;i<num.length;i++){
            for(int j=num.length-1;j>i;j--){
                if(num[i] + num[j] == target) {
                    System.out.println((i + 1) +","+ (j + 1));
                }
            }
        }
    }
}