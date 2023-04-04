public abstract class MilkShakeFitDecorator implements MilkShake{
    private final MilkShake milkShakeDecorator;

    protected MilkShakeFitDecorator(MilkShake milkShakeDecorator) {
        this.milkShakeDecorator = milkShakeDecorator;
    }
    public MilkShake getMilkShake(){
        return milkShakeDecorator;
    }
    @Override
    public double preco(){
        return milkShakeDecorator.preco();
    }
    @Override
    public String ingredientes(){
        return milkShakeDecorator.ingredientes();
    }
}
