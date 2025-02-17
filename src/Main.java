public class Main {
    public static void main(String[] args) {
        Cane cane = new Cane();
        cane.dormi();
        System.out.println("Sono un cane!");
        cane.verso();
        cane.mangia();

        System.out.println("");

        Passerotto passerotto = new Passerotto();
        passerotto.dormi();
        System.out.println("Sono un passerotto!");
        passerotto.verso();
        passerotto.mangia();

        System.out.println("");

        Aquila aquila = new Aquila();
        aquila.dormi();
        System.out.println("Sono un'aquila!");
        aquila.verso();
        aquila.mangia();

        System.out.println("");
        
    }
}
