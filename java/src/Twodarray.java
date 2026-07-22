public class Twodarray {
    public static void main(String[] args) {

        //declearation
        int[] [] arr;

        //allocation
        arr= new int[3] [4];

        //initialization
        int [] [] brr ={
                {2,3},
                {4,5},
                {6,7},
                {8,9}
        };
//        System.out.println(brr[0][0]);
        int rowlength = brr.length;
        int collength = brr[0].length;
        for (int row = 0; row <rowlength-1; row++)
        {
            for (int col = 0; col <collength-1 ; col++) {
                System.out.println(arr[row][col]);
            }

        }
    }
}
