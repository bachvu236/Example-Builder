import entity.CivilEngineer;
import service.HouseBuilder;
import service.Implement.House;
import service.Implement.IglooHouseBuilder;

public class Builder {
    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
        engineer.constructHouse();
        House house = engineer.getHouse();
        System.out.println("Builder constructed " + house);
    }
}
