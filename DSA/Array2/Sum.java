 public class Sum{
    static void change_Array(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }
public static void main(String args[]){
    int arr[] = new int[3];
    arr[0]=5;
    arr[1]=3;
    arr[2]=4;
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    
    change_Array(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }

}
}