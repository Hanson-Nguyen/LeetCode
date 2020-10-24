public class Duplicate_Zeros_1089 {
    public void duplicateZeros(int[] arr) {
        
        int[] temp = new int[arr.length];
        
        int i = 0;
        int j = 0;
        
        for (i = 0; i < arr.length; i++) {
            if (j < arr.length) {
                if (arr[i] == 0 && j < arr.length - 1) {
                    temp[j] = 0;
                    temp [j+1] = 0;
                    j = j + 2;
                }
                else {
                    temp[j] = arr[i];
                    j++;
                }
            }
        }
        
        for (i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
        
    }
}
