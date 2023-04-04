public class MilkShakeChocolate extends MilkShakeChocolateDecorator{
    public MilkShakeChocolate(MilkShake milkShake) {
        super(milkShake);
    }
    @Override
    public double preco(){
        return super.preco() + 0.5;
    }
    @Override
    public String ingredientes(){
        return super.ingredientes() + ", Biscoite de chocolate, Creme de Chantilly.\n";
    }
}
