public class MilkShakeCupCake extends MilkShakeCriativoDecorator{
    protected MilkShakeCupCake(MilkShake milkShakeDecorator) {
        super(milkShakeDecorator);
    }
    @Override
    public double preco(){
        return super.preco() + 1.0;
    }
    @Override
    public String ingredientes(){
        return super.ingredientes() + ", Sorvete de Morango, Creme de Avelã, Geleia de Frutas\n";
    }
}
