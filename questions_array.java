import java.util.*;
public class questions_array {
    public static void main(String[] args) {
        
// Scanner sc = new Scanner(System.in);

// int size = sc.nextInt();


// int Numbers[] = new int [size];


// for(int i = 0; i<size; i++){
//     Numbers[i] = sc.nextInt();
// }


// int min = Integer.MIN_VALUE;
// int max = Integer.MAX_VALUE;

// for(int i = 0; i<Numbers.length; i++){
//     if(Numbers[i] < min){

//         min = Numbers[i];

//     }
// if(Numbers[i]>max){
//     max = Numbers[i];
// }

// System.out.println("Largest number is : "+max);
// System.out.println("Smallest number is : "+min);
//     }




// This program checks the given array is in assending order or Desending order

Scanner sc = new Scanner(System.in);

int size = sc.nextInt();


int Numbers[] = new int [size];

// input
for(int i=0; i<size; i++){

Numbers[i] =sc.nextInt();

}

boolean isAscending = true;


for(int i = 0; i<Numbers.length-1; i++){
    // Notice:- Numbers.length  -1 as a termination condition 
    if(Numbers[i] > Numbers[i+1]){
        // This is the condition for assending order

        isAscending =false;
    }
}

if(isAscending){
    System.out.println("This array is sorted in Assending order");
}else{
    System.out.println("The array is not sorted in assending order");
    
}
}
}
