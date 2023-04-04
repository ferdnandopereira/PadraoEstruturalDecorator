public class MilkShakeCocoMorango extends MilkShakeFrutasDecorator{
    protected MilkShakeCocoMorango(MilkShake milkShakeDecorator) {
        super(milkShakeDecorator);
    }
    @Override
    public double preco(){
        return super.preco() + 1.20;
    }
    @Override
    public String ingredientes(){
        return super.ingredientes() + ", Sorvete de Creme, Morangos, Cocos, Hortelã, Geleia de Morango.\n";
    }
}
