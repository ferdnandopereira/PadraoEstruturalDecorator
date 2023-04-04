public abstract class MilkShakeCriativoDecorator implements MilkShake{

    private final MilkShake milkShakeDecorator;

    protected MilkShakeCriativoDecorator(MilkShake milkShakeDecorator) {
        this.milkShakeDecorator = milkShakeDecorator;
    }
    public MilkShake getMilkShae(){
        return milkShakeDecorator;
    }
    @Override
    public double preco() {
        return milkShakeDecorator.preco();
    }
    @Override
    public String ingredientes() {
        return milkShakeDecorator.ingredientes();
    }
}
