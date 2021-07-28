/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanestedclass;

/**
 *
 * @author 30039802 Caspian Maclean
 *
 * Country class stores its name and its capital city, which is a member of the
 * inner class City. The class can return its name, or a string
 * displaying all its information (name and capital).
 * 
 */
public class Country {

    class City {

        private String name;

        public City(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    private String name;
    City capitalCity;

    public Country(String name, String capitalName) {
        this.name = name;
        capitalCity = new City(capitalName);
    }
    public String getName() {
        return name;
    }
            
    public String displayCountry() {
        return "Country: " + getName() + ". Capital City: " + capitalCity.getName();
    }
}
