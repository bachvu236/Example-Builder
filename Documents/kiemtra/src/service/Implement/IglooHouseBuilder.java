package service.Implement;

import service.HouseBuilder;

public class IglooHouseBuilder implements HouseBuilder {
    private House house;

    @Override
    public void buildBasement() {
        this.house = new House();
    }

    @Override
    public void buildStructure() {
        house.setBasement("Ice Bars");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice Dome");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice Carvings");

    }

    @Override
    public House getHouse() {
        return this.house;
    }
}
