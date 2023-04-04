public class MilkShakeMorango extends MilkShakeFrutasDecorator{
    protected MilkShakeMorango(MilkShake milkShakeDecorator) {
        super(milkShakeDecorator);
    }
    @Override
    public double preco(){
        return super.preco() + 1.20;
    }
    @Override
    public String ingredientes(){
        return super.ingredientes() + ", Sorvete de Creme, Morangos, Hortelã, Geleia de Morango.\n";
    }
}
