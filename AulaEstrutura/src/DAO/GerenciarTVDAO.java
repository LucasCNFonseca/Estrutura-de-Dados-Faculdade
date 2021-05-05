package DAO;

import Modelo.Tv.Tv;

public class GerenciarTVDAO implements GerenciarVetor, GerenciarVetorRecur {
    
    private Tv[] registroTv;
    private boolean status;

    public GerenciarTVDAO() {
        this.registroTv = new Tv[12];
        this.status = false;
    }

    public Tv[] getRegistroTv() {
        return this.registroTv;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    @Override
    public void inserirValor(Tv tv) {
        
        for (int i = 0; i < this.getRegistroTv().length; i++) {
            
            if (this.getRegistroTv()[i] == null) {
                
                this.registroTv[i] = tv;
                System.out.println("Registro inserido com sucesso!");
                break;
                
            }else {
                this.status = true;
            }
            
        }
        
        if (this.status) {
            System.out.println("Limite do vetor!");
        }
        
    }

    @Override
    public void consultarValor(String key) {
        
        try {
            
            for (int i = 0; i < this.getRegistroTv().length; i++) {

                if (this.getRegistroTv()[i].getCodigo().equals(key)) {

                    System.out.println("TV encontrada na posição " + i);
                    break;

                }else {
                    this.status = false;
                }

            }

        }catch(Exception e) {
            System.out.println("Registro não encontrado!");
        }
            
    }

    @Override
    public void excluirValor(String key) {
        
        for (int i = 0; i < this.getRegistroTv().length; i++) {

            if (this.getRegistroTv()[i].getCodigo().equals(key)) {

                this.registroTv[i] = null;
                System.out.println("Registro deletado com sucesso!");
                break;

            }
            
        }
        
    }

    @Override
    public void alterarValor(Tv tv) {
        
        for (int i = 0; i < this.getRegistroTv().length; i++) {

            if (this.getRegistroTv()[i].getCodigo().equals(tv.getCodigo())) {

                this.registroTv[i] = tv;
                System.out.println("Registro alterado com sucesso!");
                break;

            }
            
        }
        
    }
    
    public void aumentarAlocacao() {
    
        Tv[] newRegistro = new Tv[this.getRegistroTv().length * 2];
        
        System.arraycopy(this.registroTv, 0, newRegistro, 0, this.getRegistroTv().length);
        
        this.registroTv = null;
        this.registroTv = newRegistro;
        
    }
    
    public void exibirTodoRegistro() {
    
        System.out.println("Exibição dos dados de todos os registros:");
        System.out.println("");
        
        for (int i = 0; i < this.getRegistroTv().length; i++) {
            
            System.out.println("--------------------------");
            System.out.println("Posição: " + i);
            System.out.println("Código: " + this.registroTv[i].getCodigo());
            System.out.println("Tamanho: " + this.registroTv[i].getTamanho());
            System.out.println("");
            
        }
        
    }

    @Override
    public void inserirValorRec(Tv tv, int i) {
        
        if (this.registroTv[i] == null && i < this.registroTv.length) {
            
            this.registroTv[i] = tv;
            System.out.println("Registro efetuado com sucesso!");
           
        }else {
        
            if (i == this.registroTv.length) {
                
                System.out.println("Limite do vetor!");
                
            }else {
            
                i++;
                inserirValorRec(tv, i);
                
            }
            
        }
        
    }

    @Override
    public void consultarValorRec(String key, int i) {
        
        if (this.registroTv[i].getCodigo().equals(key)) {
            
            System.out.println("Tv encontrada na posição: " + i);
            
        } else {
            
            if (i == this.registroTv.length) {
                
                System.out.println("Tv não encontrada!");
                
            }else {
            
                i++;
                consultarValorRec(key, i);
                
            }
            
        }
        
    }

    @Override
    public void excluirValorRec(String key, int i) {
        
        if (this.registroTv[i].getCodigo().equals(key)) {
            
            this.registroTv[i] = null;
            System.out.println("Registro excluido com sucesso!");
            
        } else {
            
            if (i == this.registroTv.length) {
                
                System.out.println("Tv não encontrada!");
                
            }else {
            
                i++;
                excluirValorRec(key, i);
                
            }
            
        }
        
    }

    @Override
    public void alterarValorRec(Tv tv, int i) {
        
        if (this.registroTv[i].getCodigo().equals(tv.getCodigo())) {
            
            this.registroTv[i] = tv;
            System.out.println("Dados alterados com sucesso!");
            
        } else {
            
            i++;
            alterarValorRec(tv, i);
            
        }
        
    }
    
}
