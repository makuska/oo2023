import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> xCoords = new ArrayList<>(Arrays.asList(2.5, 3.5, 4.5));
        List<Double> yCoords = new ArrayList<>(Arrays.asList(5.5, 6.5, 7.5));

        Kolmnurk kolmnurk = new Kolmnurk(xCoords, yCoords);
    }
}