public class recursive_element_search {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,5,6};
        System.out.println(search(arr,45,0));

    }
    public static boolean search(int[] arr,int target,int index){
       if(target==arr[arr.length-1]){
           return false;

       }
      return arr[index]==target|| search(arr,target,index+1);
    }
}
