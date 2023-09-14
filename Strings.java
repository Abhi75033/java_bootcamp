import java.util.*;
public class Strings {

    public static void main(String[] args) {
        
    
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    // Notes starts 

        // Note : String is a sigle token
        // String name = sc.next();  gives only sinle name example:n Abhishek kumar if i enterd then i will only get Abhishek not both Abbhishek & Kumar.
        // String name = sc.nextLine(); so if want to get both Abhishek as well as kumar so i have to use "sc.nextLine()" insted of "sc.next()" .
    //Notes ENds


// concept 01

        // String name = sc.nextLine();  

        // System.out.println("Your anme is "+name);


// Concept 02

        // concatenation

        // String firstname = "Abhishek";
        // String Lastname = "Kumar";
        // String Fullname = firstname+" "+Lastname;
        // System.out.println(Fullname.length());
 
        

// Concept 03 


// CharAt : Charat Defines when we want to print our string char one by one then we can use "charAt" function
// output

/*Abhishek kumar
 A
 b
 h
 i
 s
 h
 e
 k

 k
 u
 m
 a
 r
 */

// for(int i = 0; i<Fullname.length(); i++){
//     System.out.println(Fullname.charAt(i));
// }


// concept 04

// Compaore function is Variable.compareto;
/*cases
 1.s1>s2 : +ve value
 2.s1==s2: gives 0 as result
 3s1<s2: gives -ve value
 */
// String name1 ="Abhishek kumar";
// String name2 = "Abhishek kumar";

// if(name1.compareTo(name2)==0){
//     System.out.println("Strings are equal");
// }else{
//     System.out.println("Strings are not equal");
// }


// concpt 05

// Note->

// Subs-String :- To Slect Specific part of String.
// Note: Always sentence.lenth -1: means last index does not count if we write starting 1 and ending 5 then it will count only 5-1 = 4, then it will print upto only 4th index

// Notes End->

// Syntax
String Sentence = "My name is  Abhishek";
String Sub = Sentence.substring(11, Sentence.length());
    System.out.println(Sub);

// {Strings are Immutable : we can not modify the strings we can not makes changes to the string }


}
    }
