public class Strings_builder {
    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("ABhishek");

        System.out.println(sb);

        System.out.println(sb.charAt(7));
        


        // concept01

        // Set Char At at index: Set char at defines that we can set or we can replace at any char at any  index.

      sb.setCharAt(0, 'p');
System.out.println(sb);
 

// Insert: we can insert an char by using inser function. Ex:- if tony is an String if we want make tony to Stony so we can use the function called insert.

sb.insert(0, 'A');
System.out.println(sb);

// .Delete function:

sb.delete(1, 2);
System.out.println(sb.length());

}
}
