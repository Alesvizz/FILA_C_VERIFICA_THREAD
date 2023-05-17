public class Pilota extends Thread{
    private Pista p;

    public Pilota(String name, Pista p) {
        super(name);
        this.p = p;
    }

    @Override
    public void run() {
        this.p.entraPista();
        try {
            int wait = (int) (Math.random()*2000)+4001;
            sleep(wait);
        } catch (InterruptedException e) {}
        this.p.esceDallaPista();
    }
}