
public class subarray {

    public static void main(String[] args) {
        
//         String originalString = "i.like.this.program.very.much";
        
//         // Create an empty StringBuilder to store the reversed result
//         StringBuilder reversedString = new StringBuilder(originalString);
        
//       for(char i = 0; i<reversedString.length()/2; i++){

//         char front = i;
//         char back = (char) ((char) reversedString.length()-1-i);

//         char frontchar = reversedString.charAt(back);
// char backchar = reversedString.charAt(back);

// reversedString.setCharAt(front, backchar);
// reversedString.setCharAt(back, frontchar);

//       }

// System.out.println(reversedString);





 
        String originalString = "i.like.this.program.very.much";

        // Split the string by the dot (.) character
        String[] words = originalString.split("\\.");

        // Create an empty StringBuilder to store the reversed result
        StringBuilder reversedString = new StringBuilder();

        // Iterate through the words in reverse order and append them to the result
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i > 0) {
                reversedString.append(".");
            }
        }

        System.out.println(reversedString.toString()); // Output: "much.very.program.this.like"
    }
}

   


