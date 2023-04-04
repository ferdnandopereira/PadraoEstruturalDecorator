public abstract class MilkShakeChocolateDecorator implements MilkShake {

    private final MilkShake milkShakeDecorator;
    public MilkShakeChocolateDecorator(MilkShake milkShake){
        this.milkShakeDecorator = milkShake;
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