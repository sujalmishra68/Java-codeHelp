public class ArrayProblemL29 {
    public static void main(String[] args) {
       int[] arr={1,0,0,1,1,0,1};
       sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void sort(int[] arr){
        int left=0;
        for (int i = 0; i <arr.length ; i++) {
             if (arr[i]==0){
                 int temp = arr[i];
                 arr[i]=arr[left];
                 arr[left] =temp;

                 left++;

             }
        }
    }

}


//public class SortZeroOne {
//
//    public static void sort(int[] arr) {
//
//        int left = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (arr[i] == 0) {
//
//                int temp = arr[i];
//                arr[i] = arr[left];
//                arr[left] = temp;
//
//                left++;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {0,1,1,0,1,0};
//
//        sort(arr);
//
//        for(int x : arr){
//            System.out.print(x + " ");
//        }
//    }
//}