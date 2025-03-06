public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        int count = 0;
        for (int value : a) {
            boolean found = false;
            for (int i : b) {
                if (value == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int k : a) {
            boolean found = false;
            for (int i : b) {
                if (k == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                result[index++] = k;
            }
        }
        return result;
    }
}
