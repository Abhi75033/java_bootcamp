

package Non_Premitive_Data_Type;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        
/*syntax of Arrays

type 1: 
 
tpye[] Array Name = new type [size of Aaray]

type 2:
tpye Array Name[]={}; 
Where Type is defined as type data 

 */

// int [] Numbers = new int[5];

// Numbers[0]= 55; 
// Numbers[1]= 66;
// Numbers[3]= 55;

int Numbers[]= {98, 86, 32};

Scanner sc = new Scanner(System.in);

int size = sc.nextInt();


/*Input Loop:- Input loop is used to take input from user  */

int Number[]= new int[size];
for(int i = 0; i<size; i++){
    Number[i] = sc.nextInt();
}


// out loop
for (int i = 0; i<size; i++){
   System.out.println(Number[i]);
    }
}
    }

