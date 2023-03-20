public class Main {
    static public void Wyscig(Moveable test0, Moveable...test){
        test0.start();
        for (int i = 0; i<test.length; i++){
            test[i].start();
        }
    }
    public static void main(String[] args) {
        Samochod auto1 = new Samochod("Nissan");
        Pies napoleon = new Pies("Napoleon");

        Wyscig(auto1, napoleon);

    }
}