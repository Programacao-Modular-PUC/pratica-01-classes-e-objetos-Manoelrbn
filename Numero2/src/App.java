
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o peso e a altura:");

        float peso = sc.nextFloat();
        float altura = sc.nextFloat();
        pessoa p = new pessoa();
        p.setpeso(peso);
        p.setaltura(altura);
        System.out.println("IMC: " + p.calcularimc());
        System.out.println("Obesidade: " + p.informarObesidade());
    }
}
