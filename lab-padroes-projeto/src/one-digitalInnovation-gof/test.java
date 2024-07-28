package gof;

import gof.Singleton.SingletonEager;
import gof.Singleton.SingletonLazy;
import gof.Singleton.SingletonLazyHolder;
import gof.strategy.ComportamentoAgressivo;
import gof.strategy.ComportamentoDefensivo;
import gof.strategy.Robo;

public class test {
 public static void main(String[] args) {
     SingletonLazy lazy = SingletonLazy.getInstancia();
     System.out.println(lazy);
     lazy = SingletonLazy.getInstancia();
     System.out.println(lazy);

     SingletonEager eager = SingletonEager.getInstancia();
     System.out.println(eager);
     eager = SingletonEager.getInstancia();
     System.out.println(eager);

     SingletonLazyHolder LazeHolder = SingletonLazyHolder.getInstancia();
     System.out.println(LazeHolder);
     LazeHolder = SingletonLazyHolder.getInstancia();
     System.out.println(LazeHolder);

     Comportamento defensivo = new ComportamentoDefensivo();
     Comportamento agressivo = new ComportamentoAgressivo();
     Comportamento normal = new ComportamentoNormal();

     Robo robo = new Robo();
     robo.setComportamento(Normal);
     robo.mover();
     robo.mover();
     robo.setComportamento(defensivo);
     robo.mover();
     robo.setComportamento(agressivo);
     robo.mover();
     robo.mover();
     robo.mover();

     Facade facade = new Facade();

  }
}
