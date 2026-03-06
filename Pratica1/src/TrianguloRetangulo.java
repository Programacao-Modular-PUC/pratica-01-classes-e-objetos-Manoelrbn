public class TrianguloRetangulo {

    double h;
    double c1;
    double c2;

    public TrianguloRetangulo(double c1, double c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    public double CalculaHipotenusa(){
        h = Math.sqrt((c1*c1) + (c2*c2));
        return h;
    }

    public double CalculaArea(){
        return (c1 * c2) / 2;
    }
}