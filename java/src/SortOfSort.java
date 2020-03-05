public class SortOfSort {
    public void sortOfSort(int[] array) {
        int numPass = 0;
        int front = 0;
        int end = array.length - 1;

        while(front != end) {
            int index = findMaxIndex(array, front, end);
            if(numPass % 4 < 2){
                swapValue(array, end, index);
                end--;
            }
            else{
                swapValue(array, front, index);
                front++;
            }
            print(array);
            numPass++;
        }
    }

    public void print(int[]nums){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public void swapValue(int[]array, int placeOfChange, int index){
        int temp = array[placeOfChange];
        array[placeOfChange] = array[index];
        array[index] = temp;
    }

    public int findMaxIndex(int[] nums, int front, int end){
        int maxIndex = front;
        for(int i = front; i <= end; i++){
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
