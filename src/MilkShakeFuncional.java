public class MilkShakeFuncional extends MilkShakeFitDecorator{
    protected MilkShakeFuncional(MilkShake milkShakeDecorator) {
        super(milkShakeDecorator);
    }
    @Override
    public double preco(){
        return super.preco() + 1.45;
    }
    @Override
    public String ingredientes(){
        return super.ingredientes() + ", Sorvete Napolitano, Agave, Morango, adoçado com mel.\n";
    }
}
