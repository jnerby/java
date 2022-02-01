# MERGE SORT RECURSION
public static void main(String[] args){

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

}