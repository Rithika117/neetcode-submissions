

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int k = 0;

        for (int x : arr2) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == x) {
                    result[k++] = x;
                    arr1[i] = -1;
                }
            }
        }

        Arrays.sort(arr1);

        for (int x : arr1) {
            if (x != -1) {
                result[k++] = x;
            }
        }

        return result;
    }
}
