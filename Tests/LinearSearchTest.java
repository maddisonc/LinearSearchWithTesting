import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinearSearchTest {
    int[] arr0 = {};
    int[] arr1 = {1};
    int[] arr2 = {1, 2};
    int[] arr3 = {0, 1, 2};
    int[] arr4 = {0, 1, 2, 3};
    int[] arr5 = {22, 23, 25, 26, 27};
    int[] arr7 = {1, 3, 4, 5, 7, 8, 9};
    int[] arr8 = {1, 3, 4, 5, 7, 8, 9, 10};
    int[] arr10 = {1, 2, 3, 4, 5, 6, 8, 9, 10, 11};

    @Test
    void linearSearchMethodLen0()
    {
        int expected = -1;
        int actual = LinearSearch.linearSearchMethod(arr0, 1);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen1()
    {
        int expected = 0;
        int actual = LinearSearch.linearSearchMethod(arr1, 1);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen1_not()
    {
        int expected = -1;
        int actual = LinearSearch.linearSearchMethod(arr1, 45);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen2()
    {
        int expected = 0;
        int actual = LinearSearch.linearSearchMethod(arr2, 1);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen2_not()
    {
        int expected = -1;
        int actual = LinearSearch.linearSearchMethod(arr2, 9);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen3()
    {
        int expected = 0;
        int actual = LinearSearch.linearSearchMethod(arr3, 0);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen3_not()
    {
        int expected = -1;
        int actual = LinearSearch.linearSearchMethod(arr3, 4);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen4()
    {
        int expected = 2;
        int actual = LinearSearch.linearSearchMethod(arr4, 2);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen4_not()
    {
        int expected = -1;
        int actual = LinearSearch.linearSearchMethod(arr4, 9);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen5()
    {
        int expected = 2;
        int actual = LinearSearch.linearSearchMethod(arr5, 25);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen5_not()
    {
        int expected = -1;
        int actual = LinearSearch.linearSearchMethod(arr5, 30);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen7()
    {
        int expected = 4;
        int actual = LinearSearch.linearSearchMethod(arr7, 7);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen7_not()
    {
        int expected = -1;
        int actual = LinearSearch.linearSearchMethod(arr7, 70);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen8()
    {
        int expected = 4;
        int actual = LinearSearch.linearSearchMethod(arr8, 7);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen8_not()
    {
        int expected = -1;
        int actual = LinearSearch.linearSearchMethod(arr8, 900);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen10()
    {
        int expected = 5;
        int actual = LinearSearch.linearSearchMethod(arr10, 6);
        assertEquals(expected, actual);
    }

    @Test
    void linearSearchMethodLen10_not()
    {
        int expected = -1;
        int actual = LinearSearch.linearSearchMethod(arr10, 7);
        assertEquals(expected, actual);
    }

}