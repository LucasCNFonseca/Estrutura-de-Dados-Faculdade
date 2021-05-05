package Modelo.Tv;

public class ModeloTv001 extends Tv implements ControleRemoto{

    private String modelo;

    public ModeloTv001(int tamanho) {
        super.setTamanho(tamanho);
        super.setCanal(7);
        super.setVolume(20);
        super.setCodigo("001");
        super.setStatus(false);
    }
    
    public ModeloTv001() {
        super.setCanal(0);
        super.setVolume(0);
        super.setStatus(false);
    }
    
    @Override
    public void mudarCanal(int canal) {
        super.setCanal (canal);
        System.out.println("Canal: " + canal);
    }

    @Override
    public void ligar() {
        super.setStatus(true);
        System.out.println("ON");
    }

    @Override
    public void desligar() {
        super.setStatus(false);
        System.out.println("OFF");
    }

    @Override
    public void aumentarVolume(int taxa) {
        int aux = super.getVolume();
        
        if (aux < 100) {
            aux = aux + taxa;
            super.setVolume(aux);
            
            System.out.println("Volume: " + aux);
        }else{
            System.out.println("Volume: 100");
        }
        
    }

    @Override
    public void diminuirVolume(int taxa) {
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
