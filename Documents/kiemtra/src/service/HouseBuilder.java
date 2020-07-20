package service;

import service.Implement.House;

public interface HouseBuilder {
    void buildBasement();
    void buildStructure();
    void buildRoof();
    void buildInterior();
    House getHouse();
}
