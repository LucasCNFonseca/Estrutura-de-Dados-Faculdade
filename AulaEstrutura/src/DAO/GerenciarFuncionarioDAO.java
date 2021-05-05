package DAO;

import Modelo.Pessoa.Funcionario;

public class GerenciarFuncionarioDAO implements ListaEnc{
    
    private No primeiro;
    private No ultimo;
    private int quantNo;
    
    public GerenciarFuncionarioDAO() {
    
        this.primeiro = null;
        this.ultimo = null;
        this.quantNo = 0;
        
    }

    @Override
    public void add(Funcionario funcionario) {
        
        No novoNo = new No (funcionario);
        
        if (eVazia()) {
            
            this.primeiro = novoNo;
            
        } else {
        
            this.ultimo.setProximoNo(novoNo);
            
        }
        
        this.ultimo = novoNo;
        this.quantNo++;
        
        System.out.println("Registro de Funcionário efetuado com sucesso.");
        
    }

    @Override
    public void remover(String nome) {
    
        
        
    }

    /*
    1 - Definir variável status que será utilizada para verificação de registro (encontrado/não)
    2 - Criar For para percorrer a lista até o final
    3 - Condição que verifica se o nome do funcionário é igual a chave passada para consulta
    4 - Imprimir mensagem de registro encontrado caso exista retorno positivo do comparativo se anterior
    5 - Parar o loop de repetição
    6 - Verificar variável status: se falsa, exibir mensagem de registro não encontrado
    */
    @Override
    public void consultar(String nome) {
    
        boolean status = false;
        
        for (No no = this.primeiro; no != null; no = no.getProximoNo()) {
            
            if (no.getFuncionario().getNome().equals(nome)) {
                
                System.out.println("Registro encontrado!");
                status = true;
                break;
                
            }
            
        }
        
        if (!status) {
            
            System.out.println("Registro não encontrado!");
            
        }
        
    }

    @Override
    public void alterar(String nome, Funcionario funcionario) {
    
        
        
    }
 
    public boolean eVazia(){
        
        return (this.primeiro == null);
        
    }
    
    public void imprimirLista() {
    
        for (No no = this.primeiro; no != null; no.getProximoNo()) {
            
            System.out.print(no.getFuncionario().getNome() + "->");
            
        }
        
        System.out.println("");
        
    }
    
}
