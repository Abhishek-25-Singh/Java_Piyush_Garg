 public static void main (String[] args){
System.out.print("Enter The Decimal Number For Conversion:");
      Scanner Scanner = new Scanner(System.in);
      int Decimal_Number = Scanner.nextInt();
      String  Binary_number = ""; //Empty String for Binary Number
      int Original_Decimal_Number = Decimal_Number; //Storing The Original Value of Decimal_Number For further uses
      while(Decimal_Number>0){
            int remainder = Decimal_Number % 2;  // Get the remainder when dividing by 2
            Decimal_Number = Decimal_Number/2;   // Update the decimal number by dividing by 2
            Binary_number =  remainder +  Binary_number ;  // Build the binary number (append to the left)
        }
        System.out.println("Binary Conversion of "+Original_Decimal_Number +" : "+Binary_number);
        Scanner.close(); // Close the scanner to prevent resource leaks
    }



















   }
