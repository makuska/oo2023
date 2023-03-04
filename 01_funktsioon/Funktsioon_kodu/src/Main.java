import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String args[]) { //millegiprst peab public olema siin
        int[] data = {100, 432, 213, 2, 5, 102, 4324};

        System.out.println("Array enne sorteerimist:");
        // System.out.println(Arrays.toString(data));
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println(""); //prindin tühja rea peale loopi

        //System.out.println("Array peale sorteerimist:");
        bubbleSort(data);
        randomNumbers();
    }

    private static void bubbleSort(int[] arr){
        int arr_len = arr.length;
        //arr = randomNumbers();
        int temp = 0;
        // loopin läbi iga elemendi arrays
        for (int i = 0; i < arr_len-1; i++){ //siin viimast elementi ei kontroli, sest mullisort võrdleb viimaseid elemente, ning pole mõtet võrrelda seda millegiga, mida pole
            // võrdlen elemente arrays
            if (i > 0){
                System.out.println("------------------------------------");
                System.out.println("Siit hakkab uus tiir peale array'le:");
            }
            for (int j = 1; j < (arr_len - i - 1); j++) { //siin ei vaata viimast elementi(indeksit seal elemendil)
                if (arr[j-1] > arr[j]) { // kui vasakpoolsel indeksil väärtus on väiksem, siis...
                    // vahetan kohad
                    temp = arr[j-1]; // annan tempile väiksema väärtuse
                    System.out.println("---------------------------------------");
                    System.out.println("Siit hakkab uus vahetusprotsess pihta:");
                    System.out.println("tempile annan arr[j-1] väärtuse: " + arr[j-1]);
                    System.out.println("vasakpoolne väärtus: " + arr[j-1]);
                    System.out.println("parempoolne väärtus: " + arr[j]);
                    arr[j-1] = arr[j]; // siin tegelikult vahetan alles arvud
                    arr[j] = temp; // annan indeksile j tempi väärtuse
                    System.out.println("temp väärtus peale vahetust: " + temp);
                }
            }
        }
        System.out.println("Array peale sorteerimist: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void randomNumbers(){
        Random rand = new Random();
        int numbers[] = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000);
        }
        System.out.println("random arvude array:");
        System.out.println(Arrays.toString(numbers));
    }

}


