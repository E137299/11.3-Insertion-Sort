import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class InsertionSortTest {
    
    @Test
    void testInsertionSortIterative() {
        int[] arr = {12, 4, 8, 3, 9};
        int[] expected = {3, 4, 8, 9, 12};
        InsertionSortAssignment.insertionSortIterative(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testInsertionSortRecursive() {
        int[] arr = {12, 4, 8, 3, 9};
        int[] expected = {3, 4, 8, 9, 12};
        InsertionSortAssignment.insertionSortRecursive(arr, arr.length);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        int[] expected = {};
        InsertionSortAssignment.insertionSortIterative(arr);
        assertArrayEquals(expected, arr);
        InsertionSortAssignment.insertionSortRecursive(arr, arr.length);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {5};
        int[] expected = {5};
        InsertionSortAssignment.insertionSortIterative(arr);
        assertArrayEquals(expected, arr);
        InsertionSortAssignment.insertionSortRecursive(arr, arr.length);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        InsertionSortAssignment.insertionSortIterative(arr);
        assertArrayEquals(expected, arr);
        InsertionSortAssignment.insertionSortRecursive(arr, arr.length);
        assertArrayEquals(expected, arr);
    }

    @Test
    void testReverseSortedArray() {
        int[] arr = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        InsertionSortAssignment.insertionSortIterative(arr);
        assertArrayEquals(expected, arr);
        InsertionSortAssignment.insertionSortRecursive(arr, arr.length);
        assertArrayEquals(expected, arr);
    }
}
