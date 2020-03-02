public class SortOfSort {
    public void sortOfSort(int[] array){
        int max = 0;
        int size = array.length;
        int index;
        int temp;
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                if(array[j] > max){
                    max = array[j];
                    index = j;
                }
            }
            if(i < 1 && i % 10 == 0){
                temp
            }
            else(i == size - 1){
                temp = array[index];
                array[index] = array[i];
                array[i] = array[temp];
            }
            size--;
            }
        }
    }
}
