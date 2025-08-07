package java_core_1.task_5;

public class Example {
    public int[] reverse(int[] array) {

        if (array == null){
            return null;
        }

        int[] reversedArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[reversedArray.length - 1 - i] = array[i];
        }
        return reversedArray;
    }
}
