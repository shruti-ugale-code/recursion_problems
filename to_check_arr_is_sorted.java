public class to_check_arr_is_sorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,45,5,6};
        System.out.println(sort(arr,0));

    }
    public static boolean sort(int[] arr,int index){
        if(index ==arr.length-1){
            return true;

        }
        return (arr[index]<arr[index+1]&& sort(arr,index+1));

    }
}
