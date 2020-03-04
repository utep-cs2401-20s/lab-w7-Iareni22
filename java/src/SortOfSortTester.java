import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortOfSortTest {

    /*
     * sortOfSort:
     * Test case 1
     * sortOfSort() → ?

     *    Test case ensures proper function of the method, making sure the basic functions work well and all requirements
     * are met by the test. This is a simple test that will set the precedents for further testing.
     */
    @Test //Passed
    public void sortOfSort1(){

        int[] A = {34, 63, 4, 9, 28};
        int[] B = {28, 9, 4, 34, 63};

        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(A);
        assertArrayEquals(B, A);
    }

}