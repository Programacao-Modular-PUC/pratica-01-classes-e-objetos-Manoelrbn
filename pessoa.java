public class pessoa {

    private String nome;
    private String sobrenome;
    private int idade;
    private float altura;
    private float peso;
    private float imc;

    void setnome(String nome) {
        this.nome = nome;
    }
    String getnome() {
        return this.nome;
    }
    void setsobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }   
    String getsobrenome() {
        return this.sobrenome;
    }
    void setidade(int idade) {
        this.idade = idade;
    }
    int getidade() {
        return this.idade;
    }
    void setaltura(float altura) {
        this.altura = altura;
    }
    float getaltura() {
        return this.altura;
    }
    void setpeso(float peso) {
        this.peso = peso;
    }
    float getpeso() {
        return this.peso;
    }
    void setimc(float imc) {
        this.imc = imc;
    }
    float getimc() {
        return this.imc;
    }
      public float calcularimc() {
      this.imc = this.peso / (this.altura * this.altura);
         return this.imc;
}
public String informarObesidade() {
    if (this.imc < 18.5) {
        return "Abaixo do peso";
    } else if (this.imc >= 18.5 && this.imc < 25) {
        return "Peso normal";
    } else if (this.imc >= 25 && this.imc < 30) {
        return "Sobrepeso";
    } else {
        return "Obesidade";
    }
}
}