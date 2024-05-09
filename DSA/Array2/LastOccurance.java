public class LastOccurance {
    static int index(int arr[], int x){
    int lastindex =-1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            lastindex=i;

        }
    }
    return lastindex;
    }
    public static void main(String[] args) {
        int arr [] = {4,3,4,2,4,4,3,4};
       int sum = index(arr, 4);
        System.out.println(sum);
    }
    
}
