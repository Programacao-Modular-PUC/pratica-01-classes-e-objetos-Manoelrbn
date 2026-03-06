
import java.util.Scanner;
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double cat1, cat2;

        System.out.print("Digite o primeiro cateto: ");
        cat1 = sc.nextDouble();

        System.out.print("Digite o segundo cateto: ");
        cat2 = sc.nextDouble();

        TrianguloRetangulo t = new TrianguloRetangulo(cat1, cat2);

        System.out.println("Hipotenusa: " + t.CalculaHipotenusa());
        System.out.println("Área: " + t.CalculaArea());

        sc.close();
    }
}