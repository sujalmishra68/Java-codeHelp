public class BitwiseOperator {
  public static void main(String[] args) {
    int a = 5; // Binary: 0101
    int b = 3; // Binary: 0011

    // Bitwise AND
    int andResult = a & b; // Binary: 0001 (Decimal: 1)
    System.out.println("Bitwise AND of " + a + " and " + b + " is: " + andResult);

    // Bitwise OR
    int orResult = a | b; // Binary: 0111 (Decimal: 7)
    System.out.println("Bitwise OR of " + a + " and " + b + " is: " + orResult);

    // Bitwise XOR
    int xorResult = a ^ b; // Binary: 0110 (Decimal: 6)
    System.out.println("Bitwise XOR of " + a + " and " + b + " is: " + xorResult);

    // Bitwise NOT
    int notResult = ~a; // Binary: 1010 (Decimal: -6)
    System.out.println("Bitwise NOT of " + a + " is: " + notResult);

    // Left Shift
    int leftShiftResult = a << 1; // Binary: 1010 (Decimal: 10)
    System.out.println(a + " left shifted by 1 is: " + leftShiftResult);

    // Right Shift
    int rightShiftResult = a >> 1; // Binary: 0010 (Decimal: 2)
    System.out.println(a + " right shifted by 1 is: " + rightShiftResult);


    // Unsigned Right Shift
    int unsignedRightShiftResult = a >>> 1; // Binary: 0010 (Decimal: 2)
    System.out.println(a + " unsigned right shifted by 1 is: " + unsignedRightShiftResult);


    // swap two numbers using bitwise XOR
    int x = 10; // Binary: 1010
    int y = 20; // Binary: 10100
    System.out.println("Before swapping: x = " + x + ", y = " + y);
     x = x ^ y; // Step 1: x now becomes 30 (Binary: 11110)
      y = x ^ y; // Step 2: y becomes 10 (Binary: 1010)
      x = x ^ y; // Step 3: x becomes 20 (Binary: 10100)
      System.out.println("After swapping: x = " + x + ", y = " + y);
  }
  
}
