public class MilkShakeAcaiBanana extends MilkShakeFitDecorator{
    protected MilkShakeAcaiBanana(MilkShake milkShakeDecorator) {
        super(milkShakeDecorator);
    }
    @Override
    public double preco(){
        return super.preco() + 1.45;
    }
    @Override
    public String ingredientes(){
        return super.ingredientes() + ", Sorvete, Açaí, Banana, Castanhas de Caju, Açucar mascavo.\n";
    }
}
