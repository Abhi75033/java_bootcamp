public class Get_bit {

    // Gte bit: To determine the or to get the value on particular index in bit the get bit opreation is used.

    public static void main(String[] args) {
        
       int n = 5; // this is decimal no. the conversion in bit is 1010
       int pos = 2; //this is the position or index.
       int bitMask = 1<<pos; // BIt masking the value or coversion of 1 in bit is 0001
if((bitMask & n)==0){                            
                                                 //bit of (1) is "0001" after left shift by 2 is "01"
        System.out.println("bit was zero");    
                                                 // bit of (5) is 0101
       }else{
        System.out.println("bit was non-zero"); // hence after applying "&" operator the result will be
                                                  
                                                //      0 0 0 1
                                                //   &  0 1 0 1
                                                //  --------------
                                                //      0 0 0 1
                                                //  ---------------
                                                
                                                // so the no. is non-Zero because it has 1 at 0th
       }
    }
}
