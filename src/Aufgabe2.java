public class Aufgabe2 {
    //Ex 2 - 1

    public static int max(int[] array) {
        int max = array[0];
        for(int n : array){
            if(n > max){
                max = n;
            }
        }
        return max;
    }
    //Ex 2 - 2
    public static int min(int[] array) {
        int min = array[0];
        for(int n : array){
            if(n < min){
                min = n;
            }
        }
        return min;
    }

    //Ex 2 - 3

    public static int maxSum(int[] array) {
        int sum = 0;
        for (int n : array){
            sum += n;
        }
        return sum - min(array);
    }

    public static int minSum(int[] array) {
        int sum = 0;
        for (int n : array){
            sum += n;
        }
        return sum - max(array);
    }
}
