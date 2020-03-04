public class SortOfSort {
    public void sortOfSort(int[] array) {
        int numPass = 0;
        int front = 0;
        int placeOfChange = array.length - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            int maxIndex = 0;
            for (int j = front; j <= i; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            numPass++;
            if(numPass > 2 && numPass % 2 == 1){
                if(placeOfChange == array.length - 1){
                    placeOfChange = front;
                }
                else{
                    placeOfChange = array.length - 1;
                    front++;
                }
            }
            int temp = array[placeOfChange];
            array[placeOfChange] = array[maxIndex];
            array[maxIndex] = temp;

        }
        for(int i = 0; i < array.length; i++){
            System.out.print(array[1] + " ");
        }

    }
}
