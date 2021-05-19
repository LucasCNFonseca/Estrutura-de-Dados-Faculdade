package DAO;

import Modelo.Tv.Tv;

public interface GerenciarVetor {

    public void inserirValor(Tv tv);
    
    public void consultarValor(String key);
    
    public void excluirValor(String key);
    
    public void alterarValor(Tv tv);
    
}
