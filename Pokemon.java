import java.util.zip.DeflaterInputStream;

public class Pokemon {

    private int Ai, Di, Li;


    public int getAi() {
        return Ai;
    }

    public void setAi(int ai) {
        Ai = ai;
    }

    public int getDi() {
        return Di;
    }

    public void setDi(int di) {
        Di = di;
    }

    public int getLi() {
        return Li;
    }

    public void setLi(int li) {
        Li = li;
    }

    public int Golpe() {
       int V1 = ((Ai + Di) / 2);
        return V1;
    }


}

