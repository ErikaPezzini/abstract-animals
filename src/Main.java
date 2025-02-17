public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane();
        cane.dormi();
        System.out.println("Sono un cane!");
        cane.verso();
        cane.mangia();

        Passerotto passerotto = new Passerotto();
        passerotto.dormi();
        System.out.println("Sono un passerotto!");
        passerotto.verso();
        passerotto.mangia();
    }
}
