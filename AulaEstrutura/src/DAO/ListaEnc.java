package DAO;

import Modelo.Pessoa.Funcionario;

public interface ListaEnc {
    
    public void add(Funcionario funcionario);
    
    public void remover(String nome);
    
    public void consultar(String nome);
    
    public void alterar(String nome, Funcionario funcionario);
    
}
