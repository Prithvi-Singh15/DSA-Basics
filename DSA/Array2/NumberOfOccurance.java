public class NumberOfOccurance {
    static int Occurance(int arr[], int x){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
            
        }
        return count;
    }
    public static void main(String[] args) {
        int arr [] = {4,3,4,2,4,4,3,4};
       int sum = Occurance(arr, 4);
        System.out.println(sum);
    }
    
}
