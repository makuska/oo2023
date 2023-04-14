import java.util.Arrays;

public class KinnisvaraTallinn extends Kinnisvara implements KinnisvaraService{

//    String[] piirkonnadTLN = new String[]{"Südalinn", "Kalamaja", "Kadriorg"};

    public KinnisvaraTallinn(String linn, int hind, double pindala, String piirkond) {
        super(linn, hind, pindala, piirkond);
    }

    @Override
    public double getEstateArea(Kinnisvara kinnisvara) {
//        return kinnisvara.getPindala();

        return kinnisvara.getPindala();
    }

    @Override
    public int getPrice(Kinnisvara kinnisvara) {
        if (kinnisvara.getPindala() > 50){
            kinnisvara.setHind((int) (kinnisvara.hind*1.3));
            return kinnisvara.getHind();
        }
        return kinnisvara.getHind();
    }

    @Override
    public String getLocation(Kinnisvara kinnisvara) {
//        if (!Arrays.asList(kinnisvara.getPiirkond()).containsAll(List.of(piirkonnadTLN))){
//        if (!Arrays.asList(kinnisvara.getPiirkond()).contains("Kesklinn")){
        if (!kinnisvara.getPiirkond().equals("Kesklinn")){
            kinnisvara.setPiirkond("Haha oled vaene, vaata parem lasnaka korterit");
            return kinnisvara.getPiirkond();
        } else {
            return kinnisvara.getPiirkond();
        }
    }

    public String getLocation2(){
        if (this.piirkond.equals("Kesklinn")){
            this.piirkond = "Haha oled vaena, vaata parem lasnaka korterit";
            return this.piirkond;
        }
        return this.piirkond;
    }

    @Override
    public Kinnisvara getALlData(Kinnisvara kinnisvara) {
        return kinnisvara;
    }


}
