

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
        System.out.print("\nmaximum rounded grade: " + Universitaet.maximalAbgerundetenNoten(grades));

        System.out.print("\n----------------------------------------------");
        System.out.print("\nProblem 2-------------------------------------");

        int[] array = {4, 8, 3, 10, 17};
        System.out.print("\nMaximum number: " + Aufgabe2.max(array));
        System.out.print("\nMinimum number: " + Aufgabe2.min(array));

    }
}