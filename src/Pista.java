
public class Pista {
    private int numGokart;

    public Pista(int numGokart) {
        this.numGokart = numGokart;
    }

    public synchronized void entraPista(){
        String name = Thread.currentThread().getName();
        try {
           System.out.println(name + " entra nello spogliatoio per indossare casco e tuta..."); 
           while (numGokart <= 0) {
            System.out.println(name + " sta aspettando di salire su GOKART... \n");
                wait();
           }
           numGokart--;
           System.out.println(name + " sale sul GoKart \n");
        } catch (InterruptedException e) {}
    }

    public synchronized void esceDallaPista(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " esce dalla pista e torna negli spogliatoi! \n");
        numGokart++;
        notifyAll();
    }


}
