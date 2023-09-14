public class set_bit {
    public static void main(String[] args) {
        int n = 5; 
        int pos = 4;
        int bitMask = 1<<pos;

        int newnumber = bitMask | n;

        System.out.println(newnumber);
    }
}
