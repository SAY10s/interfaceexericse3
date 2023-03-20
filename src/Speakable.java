public interface Speakable {
    static int QUIET = 0;
    static int LOUD = 1;

    String getVoice(int voice);
}
