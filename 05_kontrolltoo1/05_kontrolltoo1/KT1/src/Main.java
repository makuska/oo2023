import java.util.ArrayList;
import java.util.List;

public class Main {
    static double kiirus;
    static double speed2;
    static double average;
    static ArrayList<Double> avgSpeeds = new ArrayList<>();
    static ArrayList<Double> avg = new ArrayList<>();
    public static void main(String[] args) {
//        double esimene = avgSpeed(10, 5);
//        double teine = avgSpeed(20, 5);
//        double kolmas = avgSpeed(30, 5);
        avgSpeed(5, 10);
        avgSpeed(10, 15);
        avgSpeed(20, 400);
        System.out.println(avgSpeeds);
        findAvgSpeeds(avgSpeeds);
        System.out.println(avg);
    }

    public static void avgSpeed(double speed1, double speed2){
        avgSpeeds.add((speed1 + speed2) / 2);
    }

    public static void findAvgSpeeds(ArrayList<Double> avgSpeeds){
        for (int i = 0; i < avgSpeeds.size(); i++) {
            kiirus = i++;
            System.out.println(i);
        }
        avg.add(kiirus);
    }
}