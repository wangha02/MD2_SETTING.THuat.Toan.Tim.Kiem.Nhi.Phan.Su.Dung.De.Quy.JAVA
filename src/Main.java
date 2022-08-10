import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter so luong phan tu trong mang ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter cac phan tu co trong mang");
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr,5));
    }

    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = left + arr.length -1;
        for (int i = 0; i < arr.length; i++) {
            int mid = (left + right) / 2;
            if (arr[mid] == value){
                return mid;
            } else if (value > arr[mid]) {
                left = mid +1;
            }else {
                right = mid-1;
            }
        }
        return -1;
    }

}