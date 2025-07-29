package arrays;

public class PeakElement {

        public int peakElement(int[] arr) {
            int max = 0;
            for(int i = 0;i < arr.length; i++){
                if(max < arr[i]){
                    max = arr[i];
                }
            }
            for(int j = 0; j < arr.length; j++){
                if(max==arr[j]){
                    return j;
                }
            }
            return 0;
        }
    }
    
//true or false