public abstract class MilkShakeFrutasDecorator implements MilkShake {
    private final MilkShake milkShakeDecorator;

    protected MilkShakeFrutasDecorator(MilkShake milkShakeDecorator) {
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
