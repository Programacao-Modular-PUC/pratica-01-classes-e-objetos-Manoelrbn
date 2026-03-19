import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        pessoa[] pessoas = new pessoa[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {

            pessoa p = new pessoa();

            System.out.println("Cadastro " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Sobrenome: ");
            String sobrenome = sc.nextLine();

         
            if (i > 0) {
                String nomeCompletoAtual = nome + sobrenome;
                String nomeCompletoAnterior = pessoas[i - 1].getNome() + pessoas[i - 1].getSobrenome();

                if (nomeCompletoAtual.equalsIgnoreCase(nomeCompletoAnterior)) {
                    break;
                }
            }

            p.setNome(nome);
            p.setSobrenome(sobrenome);

            System.out.print("Altura (ex: 1.75): ");
            p.setAltura(sc.nextFloat());

            System.out.print("Peso: ");
            p.setPeso(sc.nextFloat());

            sc.nextLine(); 

            System.out.print("Data de nascimento (dd/mm/aaaa): ");
            String dataStr = sc.nextLine();

            String[] partes = dataStr.split("/");

            Data data = new Data();
            data.setDia(Integer.parseInt(partes[0]));
            data.setMes(Integer.parseInt(partes[1]));
            data.setAno(Integer.parseInt(partes[2]));

            p.setDataNascimento(data);

            p.calcularIMC();

            pessoas[i] = p;
            count++;
            System.out.println();
        }

        // Exibição dos dados
        System.out.println("\n===== RESULTADOS =====\n");

        for (int i = 0; i < count; i++) {

            pessoa p = pessoas[i];

            System.out.println("Cadastro " + (i + 1) + ":");
            System.out.println("Nome completo: " + p.getNome() + " " + p.getSobrenome());
            System.out.println("Nome de referência: " + p.nomeReferencia());
            System.out.println("Idade: " + p.calculaIdade());
            System.out.println("Peso: " + p.getPeso());
            System.out.println("Altura: " + p.getAltura());
            System.out.println("IMC: " + p.getIMC());
            System.out.println("Classificação: " + p.informarObesidade());
            System.out.println();
        }

        sc.close();
    }
}
