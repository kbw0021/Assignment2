/**
 * Creating two functions, an array that finds the minimum amount and an array that finds the maximum amount.
 */
public class Finder {


    public static Integer findMin(int[] intArray) {
            if (intArray == null || intArray.length == 0) {
                return null;
            }
            int minVal = intArray[0];
            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] < minVal) {
                    minVal = intArray[i];
                }
            }

            return minVal;
        }



    public static Integer findMax(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            return null;
        }
        int maxVal = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > maxVal) {
                maxVal = intArray[i];
            }
        }
        return maxVal;
    }
}
