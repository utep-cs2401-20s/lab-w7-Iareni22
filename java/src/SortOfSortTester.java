import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortOfSortTest {

    /*
     * sortOfSort:
     * Test case 1
     * sortOfSort() → B

     *    Test case ensures proper function of the method, making sure the algorithm correctly decides the placement of
     * each maximum value found.
     */
    @Test //Passed
    public void sortOfSort1(){

        int[] A = {34, 63, 4, 9, 28, 56, 76, 89, 73};
        int[] B = {73, 63, 28, 9, 4, 34, 56, 76, 89};

        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(A);
        assertArrayEquals(B, A);
    }

    /*
     * sortOfSort:
     * Test case 2
     * sortOfSort() → B

     *    Test case creates an instance for an array of only two values, confirming the algorithm does not become
     * confused in any way as to what value goes where.
     */
    @Test //Passed
    public void sortOfSort2(){

        int[] A = {5, 4};
        int[] B = {4, 5};

        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(A);
        assertArrayEquals(B, A);
    }

    /*
     * sortOfSort:
     * Test case 3
     * sortOfSort() → B

     *    Test case ensures proper function of the algorithm when presented with negative values. The algorithm traverses
     * the array looking exclusively for a max value, which should be the case even when values fall below zero.
     */
    @Test //Passed
    public void sortOfSort3(){

        int[] A = {19, 59, 73, -29, 38, -2, 5, 7};
        int[] B = {38, 19, -2, -29, 5, 7, 59, 73};

        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(A);
        assertArrayEquals(B, A);
    }

    /*
     * sortOfSort:
     * Test case 4
     * sortOfSort() → B

     *    Test case created to assure the placement of repeated values is correct without any errors in the placement
     * the values not repeated in the array. Since the repeated value is the largest in the array, the algorithm must run
     * through all of those values and then decide correctly where the lesser values are included in the array.
     */
    @Test //Passed
    public void sortOfSort4(){

        int[] A = {12, 34, 76, 92, 92, 92, 92, 92};
        int[] B = {92, 92, 34, 12, 76, 92, 92, 92};

        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(A);
        assertArrayEquals(B, A);
    }

    /*
     * sortOfSort:
     * Test case 5
     * sortOfSort() → B

     *    Test case runs an array containing both negative numbers as well as duplicates, ensuring proper performance of
     * the algorithm with both variables that could cause any possible problems for the method. This ensures the method
     * works well in all scenarios of any sequence of integers.
     */
    @Test //Passed
    public void sortOfSort5(){

        int[] A = {48, 48, -5, 8, -34, 73, -34, 56};
        int[] B = {48, 48, -34, -34, -5, 8, 56, 73};

        SortOfSort sos = new SortOfSort();
        sos.sortOfSort(A);
        assertArrayEquals(B, A);
    }
}