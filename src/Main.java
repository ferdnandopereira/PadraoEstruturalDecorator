public class Main {
    public static void imprimirInfo(MilkShake mks){
        System.out.print("Preço - R$: " + mks.preco());
        System.out.print("\nIngredientes: " +  mks.ingredientes());
    }
    public static void main(String[] args){
        MilkShake mks1 = new MilkShakeSimples();
        imprimirInfo(mks1);

        mks1 = new MilkShakeOvomaltine(mks1);
        imprimirInfo(mks1);

        mks1 = new MilkShakeOreo(mks1);
        imprimirInfo(mks1);

    }
}