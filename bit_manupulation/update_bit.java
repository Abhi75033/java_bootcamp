import java.util.*;
public class update_bit {
    public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int opr = sc.nextInt();
        int n = 5;
        int pos = 1;


        int bitmask = 1<<pos;

        if(opr==1){

        int newnumber = bitmask | n;
        System.out.println(newnumber);
        }else{
            int newbitmask = ~(bitmask);
            int nwebitnumber = newbitmask & n;
            System.out.println(nwebitnumber);
        }
        
    }
}
