package DAO;

import Modelo.Pessoa.Cliente;
import java.util.ArrayList;
import java.util.List;

public class GerenciarClienteDAO implements GerenciamentoListCliente{

    private List<Cliente> lista;
    
    public GerenciarClienteDAO() {
        
        this.lista = new ArrayList<>();
        
    }

    @Override
    public void adicionarCliente(Cliente cliente) {
        
        this.lista.add(cliente);
        System.out.println("Cliente adicionado com sucesso!");
    
    }

    @Override
    public void consultarCliente(String id) {
    
        
    
    }

    @Override
    public void removerCliente(String id) {
    
    
    
    }

    @Override
    public void alterarCliente(String id, Cliente cliente) {
    
    
    
    }

    @Override
    public void percorrerListaCliente() {
    
    
    
    }
    
}
