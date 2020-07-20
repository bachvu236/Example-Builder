package entity;

import service.HouseBuilder;
import service.Implement.House;
import service.Implement.TipiHouseBuilder;

public class CivilEngineer {
    private HouseBuilder houseBuilder;
    private House house;
    private TipiHouseBuilder tipiHouseBuilder;
    public CivilEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
    public void constructHouse(){
        houseBuilder.buildBasement();
        houseBuilder.buildInterior();
        houseBuilder.buildRoof();
        houseBuilder.buildStructure();
    };
}
