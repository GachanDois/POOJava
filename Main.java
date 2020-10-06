import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        Scanner Dados = new Scanner(System.in);

        int T = Dados.nextInt();



        for(int i = 0; i<T; i++){

            Pokemon Dabriel = new Pokemon();
            Pokemon Guarte = new Pokemon();

            int B = Dados.nextInt();
            int V1 = Dabriel.Golpe();
            int V2 = Guarte.Golpe();


            Dabriel.setAi(Dados.nextInt());
            Dabriel.setDi(Dados.nextInt());
            Dabriel.setLi(Dados.nextInt());

            Guarte.setAi(Dados.nextInt());
            Guarte.setDi(Dados.nextInt());
            Guarte.setLi(Dados.nextInt());

            if (Dabriel.getLi() % 2 == 0){
               V1 = Dabriel.Golpe() + B;
            }else{
                V1 =Dabriel.Golpe() + 0;
            }

            if (Guarte.getLi() % 2 == 0){
                V2 = Guarte.Golpe() + B;
            }else{
                V2 =Guarte.Golpe() + 0;
            }


            if (V1 > V2){
                System.out.println("Dabriel");
                System.out.println(V1);
                System.out.println(V2);
            } else if(V2 > V1){
                System.out.println("Guarte");
                System.out.println(V1);
                System.out.println(V2);
            } else{
                System.out.println("Empate");
                System.out.println(V1);
                System.out.println(V2);
            }
        }
    }
}