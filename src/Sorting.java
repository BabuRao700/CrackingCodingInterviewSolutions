public class Sorting {

    //bubble sort bubbles up greatest element to end of the array
    //pretty clean algorithm except the variable k, could have used i+1 rather than k
    public int[] bubbleSort(int[] array) {
        if(array.length <= 1) return array;

        for(int i = array.length-1; i > 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if(array[j] > array[j+1]) swap(array, j, j+1 );
                // '>=' makes the algorithm unstable since it flips duplicate elements as well
            }
        }
        return array;
    }

    //Selection sort select largest integer index for every iteration
    //and add the element in end of the array
    public int[] selectionSort(int[] array) {

        for(int unSortedIndex = array.length  - 1; unSortedIndex >= 0; unSortedIndex -- )
        {
            int largest = 0;
            for(int i = 1; i <= unSortedIndex; i++) {
                if(array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array, largest, unSortedIndex);
        }

        return array;
    }

    //Insertion sort insert lowest element to the left side every time
    public int[] insertionSort(int[] array) {
        for(int unSortedIndex = 1; unSortedIndex < array.length; unSortedIndex ++) {
            int newElement = array[unSortedIndex];
            int sortedIndex;
            for(sortedIndex = unSortedIndex;
                sortedIndex > 0 && array[sortedIndex - 1] > newElement; sortedIndex --) {
                    array[sortedIndex] = array[sortedIndex - 1];
            }
            array[sortedIndex] = newElement;
        }
        return array;
    }

    private void swap(int[] a, int i, int j) {
        int temp;

        if(i == j) return;

        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
