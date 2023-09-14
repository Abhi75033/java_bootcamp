import java.util.*;

public class arrays2Dquestion {
public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

 int[][] matrix = new int [n][m];

    // For Input loop

    for(int i = 0;i<n;i++)
    {
        for (int j = 0; j < m; j++) {
            matrix[i][j] = sc.nextInt();
        }
    }

    System.out.println("The Spiral Order Matrix is : ");

    int rowStart = 0;


    int rowend = n-1;

    int colstart = 0;

    int colend = m-1;

    while(rowStart<= rowend && colstart<colend){

        // 1
       for(int col = colstart; col<=colend; col++){
        System.out.print(matrix[rowStart][col]+" ");
       }
    rowStart++;

// 2
    for(int row = rowStart; row<=rowend; row++){
        System.out.print(matrix[row][colend]+" ");
    }
colend--;

// 3
for(int col = colend; col>=colstart; col--){
        System.out.print(matrix[rowend][col]+" ");
    }
rowend--;

for(int row = rowend; row>=rowStart; row--){
        System.out.print(matrix[row][colstart]+" ");
    }
    colstart++;
System.out.println();

    }
 
    
}
   

}