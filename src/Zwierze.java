public abstract class Zwierze {
    private String name = "bez imienia";
    Zwierze(String name){
        this.name = name;
    }
    public java.lang.String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public  abstract String getTyp();
}
