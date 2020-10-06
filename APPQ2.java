import java.io.IOException;
import java.util.Scanner;

public class APPQ2 {
    public static void main(String[] args) throws IOException {
        Boolean Verifica = true;

        Carro Jipe = new Carro();
        Jipe.setJipe(0);
        Jipe.setTuristas(0);



        while(Verifica) {

            Scanner Dados = new Scanner(System.in);

            String Entrada = Dados.nextLine();

            String v[] = Entrada.split(" ");



            if (v[0].equals("SALIDA")) {

                Jipe.setTuristas(Jipe.getTuristas() + Integer.parseInt(v[1]));
                Jipe.getTuristas();
                Jipe.Sai();

            } else if (v[0].equals("VUELTA")) {

                Jipe.setTuristas(Jipe.getTuristas() - Integer.parseInt(v[1]));
                Jipe.getTuristas();
                Jipe.Volta();

            } else if (Entrada.equals("ABEND")){
                System.out.println(Jipe.getTuristas());
                System.out.println(Jipe.getJipe());

                break;
            }
        }

    }
}
