public class Furniture {
    private Sofa sofa;
    private CoffeeTable coffeeTable;
    private Chair chair;
    public Furniture(FurnitureFactory factory){
        sofa=factory.createSofa();
        coffeeTable=factory.createCoffeeTable();
        chair=factory.createChair();
    }
    public void info_property(){
        sofa.info_property();
        chair.info_property();
        coffeeTable.info_property();
    }
}
