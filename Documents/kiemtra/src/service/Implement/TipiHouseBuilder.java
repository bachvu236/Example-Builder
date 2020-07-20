package service.Implement;

import service.HouseBuilder;

public class TipiHouseBuilder implements HouseBuilder {
    private House house;

    @Override
    public void buildBasement() {
        house.setBasement("Wooden Poles");
    }

    @Override
    public void buildStructure() {
house.setStructure("Wood and Ice");
    }

    @Override
    public void buildRoof() {
house.setRoof("Wood, caribou and seal skins");
    }

    @Override
    public void buildInterior() {
        house.setRoof("Fire Wood");
    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
