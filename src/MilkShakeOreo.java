public class MilkShakeOreo extends MilkShakeChocolateDecorator{

    public MilkShakeOreo(MilkShake milkShake) {
        super(milkShake);
    }
    @Override
    public double preco(){
        return super.preco() + 0.5;
    }
    @Override
    public String ingredientes(){
        return super.ingredientes() + ", Sorvete + Biscoito Oreo, Creme de Chantilly.\n";
    }
}
