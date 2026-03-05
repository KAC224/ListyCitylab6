package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class maintains a list of City objects.
 */
public class CityList {

    /** List that stores City objects */
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the list if it does not exist
     */
    public void add(City city){
        if(cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * Returns sorted list of cities
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks whether a city exists in the list
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Removes a city from the list
     */
    public void delete(City city){
        if(!cities.contains(city)){
            throw new IllegalArgumentException();
        }
        cities.remove(city);
    }

    /**
     * Returns number of cities
     */
    public int countCities(){
        return cities.size();
    }
}