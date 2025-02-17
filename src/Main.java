public class Main {

    public static void faiVolare(IVolante animale){
        animale.vola();
    }

    public static void faiNuotare(INuotante animale){
        animale.nuota();
    }

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
        faiVolare(passerotto);

        System.out.println("");

        Aquila aquila = new Aquila();
        aquila.dormi();
        System.out.println("Sono un'aquila!");
        aquila.verso();
        aquila.mangia();
        faiVolare(aquila);

        System.out.println("");

        Delfino delfino = new Delfino();
        delfino.dormi();
        System.out.println("Sono un delfino!");
        delfino.verso();
        delfino.mangia();
        faiNuotare(delfino);
    }
}
