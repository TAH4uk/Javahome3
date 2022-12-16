
public class minMaxMidlNum {
    public static void main(String args[]) {
        int array[] = new int[] { 10, 11, 15, 2, 12, 10 };

        int max = getMax(array);
        System.out.println("Минимальное значение: " + max);

        int min = getMin(array);
        System.out.println("Минимальное значение: " + min);

        int midl = getMidl(array);
        System.out.println("Среднее значение: " + midl / array.length);
    }

    public static int getMax(int[] inputArray) {
        int maxValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray) {
        int minValue = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    public static int getMidl(int[] inputArray) {
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum += inputArray[i];
        }
        return sum;
    }
}
