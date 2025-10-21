public class Universitaet {

//EX 1 __________________________________________________________________________________________
    //metoda ajutatoare care sa copieze array ul de note dat, pt a putea sa ramana nemodificat
    public static int[] copyArray(int[] notenArray) {

        int[] copiedArray = new int[notenArray.length];
        for (int i = 0; i < notenArray.length; i++) {
            copiedArray[i] = notenArray[i];
        }
        return copiedArray;
    }

    //Ex 1 - 1
    public static int[] nichtAusreichenderNoten(int[] notenArray){
        int[] result =new int[0];
        for(int i=0; i<notenArray.length; i++){
            if(notenArray[i] < 38){
                int[] temp = copyArray(result);
                result = new int[temp.length+1];
                result = copyArray(temp);
                result[result.length-1]=i;
            }
        }
        return result;
    }
}
