import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList <Pilota> lista = new ArrayList<>();
        Pista p = new Pista(4);

        for (int i = 0; i < 8; i++){
            lista.add(new Pilota("Pilota " + (i+1), p));
        }

        for (Pilota pi : lista){
            pi.start();
        }
    }
}
