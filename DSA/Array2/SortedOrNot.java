

public class SortedOrNot{
    static boolean sort(int arr[]){
    for(int i=0;i<arr.length;i++){
        if(arr[i]<arr[i+1]){
            return true;
        }
      
    }
     return false;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr);
        }
        
    }
}