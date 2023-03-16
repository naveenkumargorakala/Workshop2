package Workshop2;

public class DistinctArray {

    static int distinctValues(int arr[],int n) {
        int c = 1;
        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
            if (i == j) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        int arr[]={98,57,98,76,56,45,23,34,55,34};
        int n=arr.length;
        System.out.println(distinctValues(arr,n));

    }
}
