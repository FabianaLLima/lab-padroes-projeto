package gof.strategy;

import gof.Strategy.Comportamento;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.print("Movendo-se normalmente");
    }
}
