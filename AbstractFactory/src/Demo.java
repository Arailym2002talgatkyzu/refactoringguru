import java.util.Scanner;
public class Demo {
    private static Furniture choosingFurniture(){
        Furniture furniture;
        FurnitureFactory factory;
        Scanner in = new Scanner(System.in);
        System.out.print("What model of furniture are you looking? ");
        String model = in.next();

        if(model.contains("victorian")){
            factory=new VictorianFurnitureFactory();
            furniture= new Furniture(factory);
        }
        else {
            factory= new ModernFurnitureFactory();
            furniture=new Furniture(factory);
        }
        return furniture;
    }

    public static void main(String[] args) {
        Furniture furniture=choosingFurniture();
        furniture.info_property();
    }


}
