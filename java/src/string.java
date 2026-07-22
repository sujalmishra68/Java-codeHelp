public class string {
    public static void main(String[] args) {
//        String str = "Sujal";
//        String str1 = new String("Kumar");
//        String str2 = new String("Mishra");
//        String str3 = new String("SUJAL");
//        System.out.println(str + " " + str1 + " " + str2);
//        System.out.println(str.length() + str1.length() + str2.length());
////        System.out.println(str.charAt(5));
//        System.out.println(str.compareTo(str1));
//        System.out.println(str.length() == str1.length());
//        System.out.println("Hello\tWorld");
//        System.out.println("Hello\nWorld");
//        System.out.println("He said \"Java\"");
//        System.out.println(str.equals(str3));
//        System.out.println(str.equalsIgnoreCase(str3));
//
//
//        StringBuilder sb = new StringBuilder("Java");
//
//        sb.replace(0,4,"Python");
//
//        System.out.println(sb);

                                            //<---------Practise----------->
//        printString("Hello World");

        String str= "sujall";
        System.out.println(getLength(str));

        }

        // Print each character of the string
        static void printString(String str){
             int n=str.length();
             for( int i=0;i<n;i++){
                 char ch = str.charAt(i);
                 System.out.println(ch);
             }


    }
    //Count length of String without length()
     static int getLength(String str){
         int count = 0;

         for (char ch : str.toCharArray()) {
             count++;
         }

         return count;

     }
}
