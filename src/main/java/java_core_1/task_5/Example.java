package java_core_1.task_5;

public class Example {
    public int[] reverse(int[] array) {

        if (array == null) {
            return null;
        }

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
        return array;
    }
}
