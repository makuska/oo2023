import java.util.Arrays;

public class Main {
    static int[] arvud = {1, 2, 3, 4, 5};
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(aritKeskmine(5, 5, 5));

        System.out.println(libisevKeskmine2(new double[]{1, 3, 4, 6, 1, 9}));
    }

    private static double aritKeskmine(double first, double second, double third){
        return (first + second + third) / 3;
    }

//    private static List libisevKeskmine(int[] arvud){
//        List arvud2 = Collections.singletonList(arvud);
//        return (arvud2.subList(arvud2.size()-2, arvud2.size()));
//    }
    private static double libisevKeskmine2(double[] arvud){
        double[] lastElements = new double[]{arvud[arvud.length - 2], arvud[arvud.length-1]};
        return (lastElements[0] + lastElements[1]) / 2;
    }

    /* TUNNI LAHENDUSED */
    private static double[] libisevKeskmine3(double[] arvud){
        double[] valjund = new double[arvud.length - 2];
        for (int i = 0; i < valjund.length; i++) {
            valjund[i] = (valjund[i] + valjund[i+1] + valjund[i+2]) / 3;
        }
        return valjund;
    }
}