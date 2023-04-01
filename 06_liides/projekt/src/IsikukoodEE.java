public class IsikukoodEE extends Isikukood implements Andmed{

    public IsikukoodEE(String nimi, String isikukood) {
        super(nimi, isikukood);
    }

    @Override
    public String getSugu() {
        if (isikukood.startsWith("3") || isikukood.startsWith("5")) {
            return "M";
        } else if (isikukood.startsWith("4") || isikukood.startsWith("6")){
            return "F";
        }
        return "Vigane isikukood!";
    }

    @Override
    public String getKuupaev() {
        if (isikukood.startsWith("3") || isikukood.startsWith("4")) {
            return isikukood.substring(5, 7) + "." + isikukood.substring(3, 5) + ".19" + isikukood.substring(1, 3);
        } else if (isikukood.startsWith("5") || isikukood.startsWith("6")){
            return isikukood.substring(5, 7) + "." + isikukood.substring(3, 5) + ".20" + isikukood.substring(1, 3);
        }
        return "Vigane isikukood!";
    }

    @Override
    public int getVanus() {
        if (isikukood.startsWith("3") || isikukood.startsWith("4")) {
            return 2023 - (1900 + Integer.parseInt(isikukood.substring(1, 3))); //hard-coded
        } else if (isikukood.startsWith("5") || isikukood.startsWith("6")){
            return 2023 - (2000 + Integer.parseInt(isikukood.substring(1, 3))); //hard-coded
        }
        return -1; //mingi jama
    }
}
