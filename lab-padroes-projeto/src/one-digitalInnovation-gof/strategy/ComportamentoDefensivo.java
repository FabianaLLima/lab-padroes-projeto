package gof.strategy;

public class ComportamentoDefensivo extends Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se Defensivamente");
    }
}
