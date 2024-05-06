import java.util.ArrayList;

public class Part2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("date");
        list.add("elderberry");
        list.add("fig");

        String key = "date";
        int beginIdx = 0;
        int endIdx = list.size() - 1;
        System.out.println(recLinearSearch(list, key, beginIdx, endIdx));
        System.out.println(BinarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5));
        System.out.println(recBinarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 5, 0, 8));
        System.out.println(recBinarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10, 0, 8));
        System.out.println();


    }
    //Part2.1
    public static int recLinearSearch(ArrayList<String> list, String key, int beginIdx, int endIdx) {
        if (beginIdx > endIdx) {
            return -1;
        }
        if (list.get(beginIdx).equals(key)) {
            return beginIdx;
        } else {
            return recLinearSearch(list, key, beginIdx + 1, endIdx);
        }
    }
    //Part2.2
    public static int BinarySearch(int[] a, int search){
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (a[mid] == search) {
                return mid;
            } else if (a[mid] < search) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    //Part2.2
    public static int recBinarySearch(int [] a, int search, int low, int high){
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (a[mid] == search) {
            return mid;
        } else if (a[mid] < search) {
            return recBinarySearch(a, search, mid + 1, high);
        } else {
            return recBinarySearch(a, search, low, mid - 1);
        }
    }
    public static int recursiveBinarySearch(int[] array, int search, int low, int high) {

        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (array[mid] == search) {
            return mid;
        } else if (array[mid] < search) {
            return recursiveBinarySearch(array, search, mid + 1, high);
        } else {
            return recursiveBinarySearch(array, search, low, mid - 1);
        }
    }

}
