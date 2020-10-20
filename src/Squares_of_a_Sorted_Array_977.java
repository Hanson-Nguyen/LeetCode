import java.util.Arrays;

public class Squares_of_a_Sorted_Array_977 {
    public int[] sortedSquares(int[] A) {
        
        int[] a = new int[A.length];
                
        for (int i = 0; i < A.length; i++) {
            
            a[i] = A[i] * A[i];
            
        }
        
        Arrays.sort(a);
        
        return a;
    }
}