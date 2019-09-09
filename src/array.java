import java.util.Arrays;
public class array {
    public static void main(String[] args) {
        int[] arr = {12, 1, 7};
        System.out.print("default array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nsorted array: ");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nminimum array element: " + arr[0] + "\nsecondary minimum array element: "+arr[1]);
    }
}
