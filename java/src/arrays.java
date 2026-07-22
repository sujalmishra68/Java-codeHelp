import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements");
        int n = sc.nextInt();

        int[] nums=new int[n];

        System.out.println("Enter the "+n+"values");
        for(int i=0;i<nums.length;i++)
        {

            nums[i]=sc.nextInt();
        }
        System.out.println("elements are");
        for(int i=0;i<5;i++){
            System.out.println(nums[i]);
        }
          sc.close();
    }
}
