public class ArryaManuplationProblem {
  public static void main(String[] args) {
     
    //array for reversing the array
    int [] arr ={1,2,32,4,69,10};
    System.out.println("-----------Reverse the array----------");
   reversearray(arr); 
  }
  static void reversearray(int [] arr){
    System.out.print("The original array is: ");
    for(int k :arr){
      System.out.print(k + " ");
    }
    System.out.println();
    int i=0;
    int j=arr.length-1;
    while(i<= j){
      int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
      System.out.println("The reversed array is: ");
      for(int k :arr){
        System.out.print(k + " ");
      }
  }
}
