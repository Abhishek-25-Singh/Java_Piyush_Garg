public static void main(String[] args){

//       int a = 3;
//       int b = 4;
//        Bitwise And operator(&)
//        System.out.println(" a & b : "+ (a & b));
//        //Bitwise OR operator(|)
//        System.out.println(" a | b : "+ ( a | b));
//        //Bitwise NOT operator(~)
//        System.out.println(" ~a :" + ( ~a));
//        //Bitwise XOR operator(^)
//        System.out.println( " a ^ b : "+ (a ^ b)) ;
//        Bitwise Right Shift Operator
//        System.out.println(10>>1);
//        //Bitwise left Shift Operator
//        System.out.println(10<<2);
//Give an integer , return an array ans of length n+1 such That for each i(0<=i<=n) is the number of 1's in the binary representation of i
        System.out.print("Enter the integer :");
       Scanner Scanner = new Scanner(System.in);
       int num = Scanner.nextInt();
       int result = 0; // This will hold the count of '1' bits
        while(num !=0){
            int last_bit = num & 1; // Get the last bit of num
            if(last_bit==1){
                result++; // If the last bit is 1, increment the result
            }
            num = num >> 1; // Right shift num to check the next bit
        }
        System.out.println("Number of 1 bits: " + result);
    }












