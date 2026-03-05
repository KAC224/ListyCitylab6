package com.example.listycity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private City mockCity(){
        return new City("Edmonton", "Alberta");
    }

    private CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);

        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }

    @Test
    void testAddException() {
        CityList cityList = mockCityList();

        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    void testHasCity(){
        CityList cityList = mockCityList();
        City city = mockCity();

        assertTrue(cityList.hasCity(city));
    }

    @Test
    void testDelete(){
        CityList cityList = mockCityList();
        City city = mockCity();

        cityList.delete(city);

        assertFalse(cityList.hasCity(city));
    }

    @Test
    void testDeleteException(){

        CityList cityList = mockCityList();

        City city = new City("Toronto", "Ontario");

        assertThrows(IllegalArgumentException.class, () -> {
            cityList.delete(city);
        });

    }

    @Test
    void testCountCities(){
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countCities());

        cityList.add(new City("Calgary","Alberta"));

        assertEquals(2, cityList.countCities());
    }
}