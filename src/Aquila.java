class Aquila extends Animale implements IVolante{
    @Override
    public void verso(){
        System.out.println("Screech!");
    }

    @Override
    public void mangia(){
        System.out.println("Mangio carne");
    }

    @Override
    public void vola(){
        System.out.println("Sto volando!!!");
    }
}
