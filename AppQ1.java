import java.io.IOException;
import java.util.Scanner;

public class AppQ1 {

    public  static class Fios {
        private int R1, R2;


        public int getR1() {
            return R1;
        }

        public void setR1(int r1) {
            R1 = r1;
        }

        public int getR2() {
            return R2;
        }

        public void setR2(int r2) {
            R2 = r2;
        }

    }

    public static void main(String[] args) throws IOException {
        Scanner Dados = new Scanner(System.in);
        int T = Dados.nextInt();

        Fios fio1 = new Fios();
        Fios fio2 = new Fios();



        for (int i = 0; i< T; i++){
            fio1.setR1(Dados.nextInt());
            fio2.setR2(Dados.nextInt());

               int R3 = fio1.getR1() + fio2.getR2();

                System.out.println(R3);

            }
        }
    }

