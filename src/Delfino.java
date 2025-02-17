class Delfino extends Animale implements INuotante {
    @Override
    public void verso(){
        System.out.println("Click Click!");
    }

    @Override
    public void mangia(){
        System.out.println("Mangio pesce");
    }

    @Override
    public void nuota(){
        System.out.println("Sto nuotando!!!");
    }
}
