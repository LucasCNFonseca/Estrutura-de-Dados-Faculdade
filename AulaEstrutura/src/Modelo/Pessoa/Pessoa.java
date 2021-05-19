package Modelo.Pessoa;

public class Pessoa {
    
    // Atributos
    private String nome;
    private String sexo;
    private int idade;

    public Pessoa(){
    
        this.nome = "";
        this.sexo = "";
        this.idade = 0;
    
    }
    
    public Pessoa(String nome, String sexo, int idade){
        
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void status() {
    
        System.out.println("----------------");
        System.out.println("Nome:  " + this.getNome());
        System.out.println("Sexo:  " + this.getSexo());
        System.out.println("Idade: " + this.getIdade() + " anos");
        
    }
    
}
