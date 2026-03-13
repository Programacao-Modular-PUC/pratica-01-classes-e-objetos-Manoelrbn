import java.util.Calendar;

public class pessoa {

    private String nome;
    private String sobrenome;
    private float altura;
    private float peso;
    private float imc;
    private Data dataNascimento;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setDataNascimento(Data data) {
        this.dataNascimento = data;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public float calcularIMC() {
        imc = peso / (altura * altura);
        return imc;
    }

    public float getIMC() {
        return imc;
    }

    public String informarObesidade() {

        if (imc < 18.5)
            return "Abaixo do peso";

        else if (imc < 25)
            return "Peso normal";

        else if (imc < 30)
            return "Sobrepeso";

        else
            return "Obesidade";
    }

    public int calculaIdade() {

        Calendar hoje = Calendar.getInstance();

        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH) + 1;
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);

        int idade = anoAtual - dataNascimento.getAno();

        if (mesAtual < dataNascimento.getMes() ||
           (mesAtual == dataNascimento.getMes() && diaAtual < dataNascimento.getDia())) {
            idade--;
        }

        return idade;
    }

    public String nomeReferencia() {

        return sobrenome + ", " + nome.toUpperCase();
    }
}