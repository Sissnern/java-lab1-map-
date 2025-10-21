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
                for(int j = 0; j < temp.length; j++){
                    result[j] = temp[j];
                }
                result[result.length-1]=notenArray[i];
            }
        }
        return result;
    }

    //Ex 1 - 2
    public static int durschschnittwert(int[] notenArray){
        int avg = 0;
        for(int n :  notenArray){
            avg+=n;
        }
        return avg/notenArray.length;
    }

    //Ex 1 - 3
    public static int[] abgerundetNoten(int[] notenArray){
        int[] result =new int[notenArray.length];
        for(int i=0; i<notenArray.length; i++){
            if(notenArray[i] >= 38){
                result[i] = notenArray[i];
                if(notenArray[i] % 5 == 3){
                    result[i] = notenArray[i] + 2;
                }
                if(notenArray[i] % 5 == 4){
                    result[i] = notenArray[i] + 1;
                }
            }
            else {
                result[i] = notenArray[i];
            }
        }
        return result;
    }

    //Ex 1 - 4      (cea mai mare nota rotunjita)
    public static int maximalAbgerundetenNoten(int[] notenArray){
        int max = 0;
        for(int n :  notenArray){
            if(n % 5 == 3 || n % 5 == 4){
                if(n > max){
                    max = n;
                }
            }
        }
        return max;
    }
}


