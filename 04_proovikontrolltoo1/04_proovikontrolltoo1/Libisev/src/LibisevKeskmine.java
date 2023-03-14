import java.util.ArrayList;
import java.util.List;

public class LibisevKeskmine {
    List<Double> arvudListis = new ArrayList<>(); // Siin kasutan Double suure tähega, sest List on disainitud töötama objektidega, mitte primitiivsete andmetüüpidega
    List<Double> arvudKeskmisega = new ArrayList<>();

    public LibisevKeskmine(double arv1, double arv2, double arv3){
        arvudListis.add(arv1);
        arvudListis.add(arv2);
        arvudListis.add(arv3);
    }

    public void lisaArv(double arv){
        arvudListis.add(arv);
        for (int i = arvudKeskmisega.size(); i < arvudListis.size(); i++) {
            double keskmine = (arvudListis.get(i) + arvudListis.get(i + 1) + arvudListis.get(i + 2)) / 3;
            arvudKeskmisega.add(keskmine);
        }
    }
}
