public class Samochod implements Moveable{
    String marka;

    Samochod(String marka){
        this.marka = marka;
    }

    @Override
    public void stop() {
        System.out.println("auto się zatrzymuje");
    }

    @Override
    public void start() {
        System.out.println("AUTO RUSZA");
    }
}
