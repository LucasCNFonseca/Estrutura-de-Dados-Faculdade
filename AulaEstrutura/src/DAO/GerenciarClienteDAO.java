package DAO;

import Modelo.Pessoa.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
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
    
        this.lista.forEach(cliente -> {
        
            if (cliente.getId().equals(id)) {
                
                System.out.println("Cliente encontrado!");
                System.out.println("Nome: " + cliente.getNome());
                
            }
                
        });
    
    }

    @Override
    public void removerCliente(String id) {
    
        for (Cliente cliente: this.lista) {
            
            if (cliente.getId().equals(id)) {
                
                this.lista.remove(this.lista.indexOf(cliente));
                System.out.println("Cliente removido com sucesso!");
                
            }
            
        }
    
    }

    @Override
    public void alterarCliente(String id, Cliente cliente) {
    
        Iterator<Cliente> i = this.lista.iterator();
        Cliente clienteAux;
     
        while(i.hasNext()) {
            
            clienteAux = i.next();
            
            if (clienteAux.getId().equals(id)) {
                
                clienteAux.setNome(cliente.getNome());
                clienteAux.setSexo(cliente.getSexo());
                clienteAux.setIdade(cliente.getIdade());
                clienteAux.setEndereco(cliente.getEndereco());
                
                System.out.println("Cliente alterado com sucesso!");
                
            }
            
        }
        
    }

    @Override
    public void percorrerListaCliente() {
    
        for (int i = 0; i < this.lista.size(); i++) {
            
            System.out.println("Nome: " + this.lista.get(i).getNome());
            
        }
    
    }
    
}
