import java.sql.SQLOutput;
import java.util.HashMap;

public class ArryaManuplationProblem {
  public static void main(String[] args) {
     
    //array for reversing the array
    int [] arr ={1,2,32,4,69,10};
    int[] arr2 ={1,2,3,4,5,2};
//   System.out.println("-----------Reverse the array----------");
//reversearray(arr);
//
//System.out.println();
//System.out.println("-----------Shift the array----------");
//shiftarray(arr);

//    System.out.println("----------alternate mannner");
//    ALternateArray(arr2);

    ModeArray(arr2);
   

  }


  //--------------------Function Begain--------------------------->
  //function to reverse the array
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

  //function to shift the array by 1
  static void shiftarray(int [] arr){
    System.out.print("The original array is: ");
    for(int k :arr){
      System.out.print(k + " ");
    }
    System.out.println();
    //last eleemt ko temp mia daal diye 
    int temp = arr[arr.length-1];
    
    //shift the array by 1
    for(int i=arr.length-1;i>0;i--){
      arr[i] = arr[i-1];
    }
    arr[0] = temp;
    System.out.println("The shifted array is: ");
    for(int k :arr){
      System.out.print(k + " ");  
    }


  }

  //print extreme elements  in alternate manner
  static void ALternateArray(int [] arr2){
    int i=0;
    int n= arr2.length;
    int j= arr2.length-1;
    while(i<=j){
      if(i==j){
        System.out.println(arr2[i]);
      }else{
        System.out.println(arr2[i]);
        System.out.println(arr2[j]);
      }
        i++;
        j--;
    }


  }


  // Find the mode of an array
  static void ModeArray(int[] arr){
    HashMap<Integer,Integer> map= new HashMap<>();

    for (int num : arr) {
      map.put(num, map.getOrDefault(num, 0) + 1);
    }


  }
}
