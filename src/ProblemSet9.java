public class ProblemSet9 {

    public int[] evenOdd(int[] arr) {
        if(arr == null) {
            return null;
        }
        else {
            int[] evenFirst = new int[arr.length];
            int size = 0;
            for (int j : arr) {
                if (j % 2 == 0) {
                    evenFirst[size] = j;
                    size++;
                }
            }
            for (int i = size; i < arr.length; i++) {
                evenFirst[i] = arr[i];
            }
            return evenFirst;
        }
    }

    public int[] notAlone(int[] arr, int alone) {
        if(arr == null || arr.length == 0) {
            return null;
        }
        else {
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] == alone) {
                    arr[i] = Math.max(arr[i - 1], arr[i + 1]);
                }
            }
            return arr;
        }
    }

    public int[] shiftLeft(int[] arr) {
        if(arr == null) {
            return null;
        }
        else {
            int temp = arr[0];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = temp;
            return arr;
        }
    }

    public int[] fillIn(int start, int end) {
        if (start > end) {
            return null;
        }
        else {
            int current = start;
            int[] filled = new int[end - start];
            for (int i = 0; i < filled.length; i++) {
                filled[i] = current;
                current ++;
            }
            return filled;
        }
    }

    public boolean triple(int[] arr) {
        if (arr == null) {
            return false;
        }
        else {
            int threeCount = 0;
            for (int j : arr) {
                if (j == 3) {
                    threeCount++;
                }
            }
            return threeCount == 3;
        }
    }

    public int pairs(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return -1;
        }
        else {
            int count = 0;
            for (int i = 0; i < a.length; i ++) {
                if(a[i] - 1 == b[i] || a[i] - 2 == b[i] || a[i] + 1 == b[i] || a[i] + 2 == b[i]) {
                    count ++;
                }
            }
            return count;
        }
    }

    public boolean twentyFour(int[] arr) {
        if(arr == null) {
            return false;
        }
        else {
            int count = 0;
            for (int i = 0; i < arr.length; i ++) {
                if (arr[i] == 2) {
                    if (arr[i + 1] == 2) {
                        count ++;
                    }
                }
                else if (arr[i] == 4) {
                    if (arr[i + 1] == 4) {
                        count ++;
                    }
                }
            }
            return count == 1;
        }
    }

    public boolean fourteen(int[] arr) {
        if (arr == null) {
            return false;
        }
        else {
            int count = 0;
            for (int j : arr) {
                if (j == 1 || j == 4) {
                    count++;
                }
            }
            return count == arr.length;
        }
    }

    public int centeredAverage(int[] arr) {
        if(arr == null || arr.length < 3) {
            return -1;
        }
        else {
            int min = arr[0];
            int max = arr[0];
            int sum = 0;
            int average = 0;

            for (int j : arr) { //min
                if (j < min) {
                    min = j;
                }
            }
            for (int j : arr) { //max
                if (j > max) {
                    max = j;
                }
            }
            for (int j : arr) { //sum
                sum += j;
            }

            sum = sum - (max + min);
            average = sum /arr.length;
            return average;
        }
    }

    public int outliers(int[] arr) {
        if(arr == null || arr.length < 1) {
            return -1;
        }
        else {
            int min = arr[0];
            int max = arr[0];
            int range;

            for (int j : arr) { //min
                if (j < min) {
                    min = j;
                }
            }
            for (int j : arr) { //max
                if (j > max) {
                    max = j;
                }
            }
            range = max - min;
            return range;
        }
    }
}