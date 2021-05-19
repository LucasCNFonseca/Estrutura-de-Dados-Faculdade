package DAO;

import Modelo.Pessoa.Funcionario;

public class No {

    private Funcionario funcionario;
    private No proximoNo;

    public No(Funcionario f) {
        this.funcionario = f;
        this.proximoNo = null;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public No getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No proximoNo) {
        this.proximoNo = proximoNo;
    }
    
}
