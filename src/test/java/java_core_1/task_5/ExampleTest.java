package java_core_1.task_5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    @DisplayName("Test reverse correct value!")
    void testReverseCorrectValue() {
        Example example = new Example();
        int[] arr = {1, 2, 3, 4, 5};
        int[] correctArrayRevers = {5, 4, 3, 2, 1};

        assertArrayEquals(correctArrayRevers ,example.reverse(arr));
    }

    @Test
    @DisplayName("Test reverse is null!")
    void testReverseWhenNull(){
        Example example = new Example();
        int[] arr = null;

        assertNull(example.reverse(arr));
    }
}