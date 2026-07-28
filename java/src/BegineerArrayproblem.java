public class BegineerArrayproblem {
  public static void main(String[] args) {
   
    int [] arr ={1,2,3,4,5,6,7,8,9,10};

    
    //average of the array
    double avg = average(arr);
    System.out.println("The average of the array is: "+avg);

    multiplyByTwo(arr);
    System.out.println("The array after multiplying each element by 2 is: ");

   //linear search in the array
    boolean ans = linearSearch(arr, 3);
    System.out.println("Is 3 present in the array: " + ans);

    //find the maximum number in the array
    int maxAns = maximum(arr);
    System.out.println("The maximum number in the array is: "+maxAns);
    

    //array for both positive and negative numbers
    int [] arr1 ={1,-2,3,-4,5,-6,7,-8,9,-10};
    sumOfPositiveAndNegative(arr1);

    //array for counting zeros and ones
    int [] arr2 ={0,1,0,1,0,1,0,1,0,1};
    int count = countZeroAndOnes(arr2);
    System.out.println("The total count of zeros and ones in the array is: " + count);

    //array for finding first unsorted element
    int [] arr3 ={1,2,3,5,4,6,7,8,9,10};
    int firstUnsorted = firstUnsortedElement(arr3);
   
    
  }
   

  // multiply each element of the array by 2
  static void multiplyByTwo(int[] arr) {
    System.out.println("-----------Multiply each element in the array----------");
    int multiply = 2;
    for(int i=0;i<arr.length;i++){
      arr[i] = arr[i]*multiply;
      System.out.println(arr[i]);
    }
  }



   // average of the array
  static double average(int[] arr) {
      System.out.println("----------- Average of the array ----------");
      int sum=0;

    for(int i=0;i<arr.length;i++){
      sum=sum+arr[i];
    }
    System.out.println("The sum of the array is: "+sum);
    double avg =(double)sum/arr.length;
    System.out.println("The average of the array is: "+avg);

    return avg;
  }
    
    
    static boolean linearSearch(int[] arr, int target) {
      System.out.println("----------- Linear search  ----------");
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == target) {
              return true; // Target found
          }
      }
      return false; // Target not found
  }


  static int maximum(int [] arr){
    int max = arr[0];
    for(int i=0; i<arr.length;i++){
      if(arr[i]>max){
        max=arr[i];
      }
    } 
    return max;
  }

  //find maximum in an array using math.max
  static int maximumUsingMathMax(int [] arr){
    int max = arr[0];
    for(int i=0; i<arr.length;i++){
      max=Math.max(max,arr[i]);
    } 
    return max;
  }

  // SUM OF POSITIVE AND NEGATIVE NUMBERS IN AN ARRAY
  static void sumOfPositiveAndNegative(int [] arr1){
    int positiveSum=0;
    int negativeSum=0;
    for(int i=0; i<arr1.length;i++){
      if(arr1[i]>0){
        positiveSum+=arr1[i]; //positiveSum=positiveSum+arr[i]
      } else {
        negativeSum+=arr1[i]; //negativeSum=negativeSum+arr[i]
      }
    }
    System.out.println("Positive Sum = " + positiveSum);
    System.out.println("Negative Sum = " + negativeSum);
  }

  // count zero and ones in an array
  static int countZeroAndOnes(int [] arr2){
    int countZero=0;
    int countOnes=0;
    for(int i=0; i<arr2.length;i++){
      if(arr2[i]==0){
        countZero++;
      } else if(arr2[i]==1){
        countOnes++;
      }
    }
    System.out.println("Count of zeros = " + countZero);
    System.out.println("Count of ones = " + countOnes);
    return countZero + countOnes;
  }

  //find first unsorted element in an array
    static int firstUnsortedElement(int [] arr3){
      for(int i=0; i<arr3.length-1;i++){
        if(arr3[i]>arr3[i+1]){
      
          return arr3[i+1];
          
        }
      }
      return -1; //array is sorted
  }
  }
