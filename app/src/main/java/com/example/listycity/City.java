package com.example.listycity;

import java.util.Objects;

/**
 * This class represents a City object.
 * It stores the city name and the province it belongs to.
 */
public class City implements Comparable<City>{

    /** Name of the city */
    private String city;

    /** Province where the city belongs */
    private String province;

    /**
     * Constructor for creating a city.
     * @param city name of the city
     * @param province province of the city
     */
    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name
     * @return city name
     */
    public String getCityName(){
        return this.city;
    }

    /**
     * Returns the province name
     * @return province name
     */
    public String getProvinceName(){
        return this.province;
    }

    /**
     * Compares cities alphabetically by name
     */
    @Override
    public int compareTo(City other){
        return this.city.compareTo(other.getCityName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province, city1.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }
}