import java.util.Arrays;

public class Merge_Sorted_Array_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int j = 0;      
        
        for (int i = m; i < m + n; i++) {
            if (j < n) {
                nums1[i] = nums2[j];
                j++;
            }

        }
        
        Arrays.sort(nums1);

    }
}