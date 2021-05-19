package DAO;

import Modelo.Tv.Tv;

public interface GerenciarVetorRecur {
    
    public void inserirValorRec(Tv tv, int i);
    
    public void consultarValorRec(String key, int i);
    
    public void excluirValorRec(String key, int i);
    
    public void alterarValorRec(Tv tv, int i);
    
}
