public class Main {
    public static void main(String[] args) {
        Info info = new Info("MacBook Air", "16gb", "Ventura");
        Arvuti arvuti1 = new Arvuti(info, 999);

        // final on sama mis const
        final Arvuti arvuti2 = new Arvuti(new Info("MacBook Pro", "32gb", "Monterey"), 1599);

        System.out.println(arvuti1.info.ram);
        System.out.println(arvuti2.info.opSysteem);
    }
}