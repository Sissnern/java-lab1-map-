

public class Main {
    public static void main(String[] args) {
        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] result = Universitaet.nichtAusreichenderNoten(grades);

        System.out.print("bad grades: ");
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}