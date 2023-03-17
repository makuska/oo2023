import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    static double kiirus = 0;
    static ArrayList<Double> avgSpeeds = new ArrayList<>();
    static ArrayList<Double> avg = new ArrayList<>();
    public static void main(String[] args) {
        avgSpeed(5, 10);
        avgSpeed(10, 15);
        avgSpeed(20, 400);
        System.out.println(avgSpeeds);
        findAvgSpeeds(avgSpeeds);
        System.out.println("Kiiruste keskmine on: " + avg);
    }

    public static void avgSpeed(double speed1, double speed2){
        avgSpeeds.add((speed1 + speed2) / 2);
    }

    public static void findAvgSpeeds(ArrayList<Double> avgSpeeds){
        for (Double avgSpeed : avgSpeeds) {
            kiirus += avgSpeed;
            System.out.println(kiirus);
        }
        avg.add(kiirus / avgSpeeds.size());
    }
}