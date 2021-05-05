package aulaestrutura;

import Modelo.Pessoa.Pessoa;

public class AulaEstrutura {

    public static void main(String[] args) {

        System.out.println("----------------");
        System.out.println(" Dados Pessoais ");

        Pessoa guilherme = new Pessoa("Guilherme", "Masculino", 18);
        guilherme.status();
        Pessoa rodrigo = new Pessoa("Rodrigo", "Masculino", 18);
        rodrigo.status();
        Pessoa lucas = new Pessoa("Lucas", "Masculino", 18);
        lucas.status();
        Pessoa gabriel = new Pessoa("Gabriel", "Masculino", 18);
        gabriel.status();

        System.out.println("----------------");

    }

}
