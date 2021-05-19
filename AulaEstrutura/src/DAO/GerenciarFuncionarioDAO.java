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

    /*
    Método para inserir na lista
    1 - Instanciar um novo No
    2 - Verificar se a lista está vazia
    3 - Se tiver vazia: add novo No na primeira posição
    4 - Senão tiver vazia: add novo No no próximo indicador da última posição
    5 - Adicionar o novo No no atributo último nó
    6 - Incrementar a quantidade de nós
    7 - Notificar registro com secesso
    */
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

    /*
    1 - Verificar se a lista está vazia
    2 - Instanciar nó auxiliar (anterior) como nulo (null)
    3 - Instanciar nó atual com a primeira posição da lista
    4 - Criar estrutura de repetição que verificará se o nó atual é diferente de null e que tem
    o nome do funcionário diferente da chave de busca.
    5 - Guardar o nó atual na instancia do nó anterior e retornará ao nó atual o próximo nó
    6 - Verifica se o nó atual é null e mostra falha na exclusão por registro não encontrado
    7 - Verifica se o nó anteriror é nulo: se for verdadeira a condição, significa que o valor a ser
    excluído tá na primeira posição
    8 - Senão a instancia anterior receberá o próximo nó do nó excluído.
    */
    @Override
    public void remover(String nome) {
    
        if (eVazia()) {
            
            System.out.println("Não há registros para remover!");
            
        }else {
        
            No anterior = null;
            No atual = this.primeiro;
            
            while(atual != null && !atual.getFuncionario().getNome().equals(nome)) {
            
                anterior = atual;
                atual = atual.getProximoNo();
            
            }
            
            if (atual == null) {
                
                System.out.println("Falha da exclusão: Registro não encontrado!");
                
            }
            
            if (anterior == null) {
                
                this.primeiro = atual.getProximoNo();
                System.out.println("Registro excluído! Tipo 1");
                
            }else {
            
                anterior.setProximoNo(atual.getProximoNo());
                System.out.println("Registro excluído! Tipo 2");
                
            }
            
        }
        
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

    /*
    1 - Laço para localização do funcionário que terá os dados alterados (chave = nome)
    2 - Novo objeto funcionário é inserido no lugar do antigo
    3 - Mensagem de alteração é exibida para o usuário
    4 - Laço é interrompido
    */
    @Override
    public void alterar(String nome, Funcionario funcionario) {
    
        for (No no = this.primeiro; no != null; no = no.getProximoNo()) {
            
            if (no.getFuncionario().getNome().equals(nome)) {
                
                no.setFuncionario(funcionario);
                System.out.println("Alteração realizada com sucesso!");
                break;
                
            }
            
        }
        
    }
    
    /*
    Método para verificar se a lista está vazia
    */
    public boolean eVazia(){
        
        return (this.primeiro == null);
        
    }
    
    /*
    Método para imprimir os nomes dos funcionários guardados na lista
    1 - Realizar um loop (For) começando do primeiro Nó até o último da lista
    2 - Imprimir o nome do funcionário
    */
    public void imprimirLista() {
    
        for (No no = this.primeiro; no != null; no.getProximoNo()) {
            
            System.out.print(no.getFuncionario().getNome() + "->");
            
        }
    
        System.out.println("");
        
    }
    
}
