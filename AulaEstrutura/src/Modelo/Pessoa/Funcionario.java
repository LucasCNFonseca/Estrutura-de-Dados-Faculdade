package Modelo.Pessoa;

public class Funcionario extends Pessoa{
    
    private String CodFunc;
    private String funcao;
    private String Setor;

    public Funcionario(String nome, String sexo, int idade, String CodFunc, String funcao, String Setor) {
        super(nome, sexo, idade);
        this.CodFunc = CodFunc;
        this.funcao = funcao;
        this.Setor = Setor;
    }

    public String getCodFunc() {
        return CodFunc;
    }

    public void setCodFunc(String CodFunc) {
        this.CodFunc = CodFunc;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSetor() {
        return Setor;
    }

    public void setSetor(String Setor) {
        this.Setor = Setor;
    }

}
