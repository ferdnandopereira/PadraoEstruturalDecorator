public class MilkShakeOvomaltine extends MilkShakeChocolateDecorator{
    public MilkShakeOvomaltine(MilkShake milkShake) {
        super(milkShake);
    }
    @Override
    public double preco(){
        return super.preco() + 0.5;
    }
    @Override
    public String ingredientes(){
        return super.ingredientes() + ", Sorvete + Ovomaltine.\n";
    }
}
