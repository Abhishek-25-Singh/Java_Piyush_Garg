public static void main (String [] args){
        System.out.print("Enter Integer :");
        Scanner Scanner = new Scanner(System.in);
        int INT_Num = Scanner.nextInt();

        //Slow Code Using Decimal/Arithmetic operation
//        if( INT_Num % 2 == 0 ){
//            System.out.println("The Integer "+INT_Num+" is Even");
//        }else{
//            System.out.println("The Integer "+INT_Num+" is odd");
//        }
        //Using Bit OPerator
        if( (INT_Num & 1) == 0 ){
         // if last bit is 0 then Number is Even
         System.out.println("The Integer "+INT_Num+" is Even");
       }else{
         // if last bit is 1 then Number is Odd
            System.out.println("The Integer "+INT_Num+" is odd");
        }
    }
    }
