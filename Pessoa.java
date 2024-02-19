public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private double peso;
    private double altura;
    private String corOlho;
    private String corCabelo;
    
    public Pessoa(String nome, int idade, char sexo, double peso, double altura, String corOlho, String corCabelo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.corOlho = corOlho;
        this.corCabelo = corCabelo;
    }

    public Pessoa() {
        
    }

    public Pessoa(String name) {
        this.nome = name;    
    }
    
    public String getName() {
        return nome;
    }

    public void setName(String name) {
        this.nome = nome;
    }

    public int getAge() {
        return idade;
    }

    public void setAge(int age) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCorOlhos() {
        return corOlho;
    }

    public void setCorOlhos(String corOlhos) {
        this.corOlho = corOlho;
    }

    public String getCorCabelos() {
        return corCabelo;
    }

    public void setCorCabelos(String corCabelos) {
        this.corCabelo = corCabelo;
    }
}
