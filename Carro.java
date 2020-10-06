public class Carro {
    private int Jipe;
    private int Turistas;

    public int getJipe() {
        return Jipe;
    }

    public void setJipe(int jipe) {
        Jipe = jipe;
    }

    public int getTuristas() {
        return Turistas;
    }

    public void setTuristas(int turistas) {
            Turistas = turistas;
        }

    public void Sai (){
        Jipe++;
    }
    public void Volta (){
        Jipe--;
    }



}
