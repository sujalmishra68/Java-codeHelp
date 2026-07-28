public class BitwisePractise{
  public static void main(String[] args) {
    
    int n=5;
    for(int i=0; i<=10;i++){
      System.out.println(n=n<<2);
     
    }
    System.out.println("---------------------");
    System.out.println("Left Shift");
    int  m=100;
    for(int i=0; i<=10;i++){
      
      System.out.println(m=m >> 1);
     
    }

    System.out.println("----------- Even Odd----------");
    int num=10;
    if((num&1)==0){
      System.out.println(num+" is Even");
    }else{
      System.out.println(num+" is Odd");
          
  }


  System.out.println("----------- Power of 2----------");
  //AGAR number power of 2 hai to uska binary representation me sirf ek hi bit set hoti hai. (MATLAB KI 1 EK BAAR HE AAT HAI 2-0010, 4-0100, 8-1000, 16-10000)
  int number=15;
  if((number & (number-1))==0){
    System.out.println(number+" is power of 2");
  }else{
    System.out.println(number+" is not power of 2");
  }
}
}