public class Assignment2 {
    public static void main(String args[]) {
        int n = 5;
        int foo[] = { 0, 1, 2, 3, 4 };
        int m = 100;
        int car[] = new int[100];

        for (int i = 0; i < m; i++) {
            car[i] = i;
        }

        System.out.printf("The total number of even numbers in foo are: %d\n", countEvenNum(foo, n));
        System.out.printf("The total number of even numbers in car are: %d\n", countEvenNum(car, m));
    }

    public static int countEvenNum(int arr[], int size) {

        int count = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
