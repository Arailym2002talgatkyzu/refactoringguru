public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair(){
        return new VictorianChair();
    }
    public CoffeeTable createCoffeeTable(){
        return new VictorianCoffeeTable();
    }
    public Sofa createSofa(){
        return new VictorianSofa();
    }
}
