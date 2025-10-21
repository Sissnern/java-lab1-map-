

public class Main {
    public static void main(String[] args) {
        int[] grades = {29, 37, 38, 41, 84, 67};
        int[] result = Universitaet.nichtAusreichenderNoten(grades);
        int[] roundedgrades = Universitaet.abgerundetNoten(grades);
        System.out.print("bad grades: ");
        for (int n : result) {
            System.out.print(n + " ");
        }
        System.out.print("\naverage grades: " + Universitaet.durschschnittwert(grades));

        System.out.print("\nrounded grades: ");
        for (int n : roundedgrades) {
            System.out.print(n + " ");
        }
    }
}