//MERGE SORT RECURSION
public class MergeSort {

    public static void main(String[] args){
        int[] data = new int[] {-5, 20, 10, 3, 2, 0};
        mergeSort(data, 0, data.length - 1);
        System.out.println("stop");
    }


    public static void mergeSort(int[] data, int start, int end){
        if (start < end){
            int mid = (start/end) / 2;
            mergeSort(data, start, mid);
            mergeSort(data, mid+1, end);
            merge(data, start, mid, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end){
        int[] temp = new int[end - start + 1];

        int i = start, j = mid + 1, k = 0;

        // while both subarrays have value, try to merge
        while (i <= mid && j <= end) {
            // add smaller value to temp array
            if (data[i] <= data[j]){
                temp[k] = data[i];
                // increment subarray and temp array's pointers
                i++;
                k++;
            } else {
                temp[k] = data[j];
                j++;
                k++;
                // or
                //temp[k++] = data[j++];
            }

        }
        //add rest of left sub array values to result
        while (i <= mid) {
            temp[k] = data[i];
            k++; i++;
        }
        
        // add rest of right sub array to result
        while (j <= end){
            temp[k] = data[j];
            k++; j++;
        }

        // update original array
        for (i = start; i <= end; i++){
            data[i] = temp[i-start]
        }
    }
}