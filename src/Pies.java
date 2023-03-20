public class Pies extends Zwierze implements Moveable, Speakable{

    Pies(String name){
        super(name);
    }
    public String getTyp(){
        return "Doggo";
    }

    @Override
    public String getVoice(int voice) {
        return null;
    }

    @Override
    public void start() {
        System.out.println("ALE PSINA RUSZYŁA");
    }

    @Override
    public void stop() {
        System.out.println("Grzeczny piesek się zatrzymał");
    }
}
