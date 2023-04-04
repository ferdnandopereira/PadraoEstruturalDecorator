public class MilkShakeCookies extends MilkShakeCriativoDecorator{
    protected MilkShakeCookies(MilkShake milkShakeDecorator) {
        super(milkShakeDecorator);
    }
    @Override
    public double preco(){
        return super.preco() + 1.0;
    }
    @Override
    public String ingredientes(){
        return super.ingredientes() + ", Sorvete de Baunilha, Cookies, Creme de Chantilly.\n";
    }
}
