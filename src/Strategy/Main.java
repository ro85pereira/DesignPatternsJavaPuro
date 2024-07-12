// package Singleton;
package Strategy;


import Facade.Facade;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       /* exemplos de Singleton
        Singleton.SingletonLazy lazy = Singleton.SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy =Singleton.SingletonLazy.getInstancia();
        System.out.println(lazy);

        Singleton.SingletonEager eager = Singleton.SingletonEager.getInstancia();
        System.out.println(eager);
        eager = Singleton.SingletonEager.getInstancia();
        System.out.println(eager);

        Singleton.SingletonLazyHolder lazyholder = Singleton.SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        lazyholder = Singleton.SingletonLazyHolder.getInstancia();
        System.out.println(lazyholder);
        */
        /* Exemplo Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        */
        //Exemplo Facade

        Facade facade = new Facade();
        facade.migrarCliente("Rodrigo","0001522000");

    }
}