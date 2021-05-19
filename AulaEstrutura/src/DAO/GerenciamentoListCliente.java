package DAO;

import Modelo.Pessoa.Cliente;

public interface GerenciamentoListCliente {
    
    public void adicionarCliente(Cliente cliente);
    
    public void consultarCliente(String id);
    
    public void removerCliente(String id);
    
    public void alterarCliente(String id, Cliente cliente);
    
    public void percorrerListaCliente();
    
}
