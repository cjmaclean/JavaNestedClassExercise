package javanestedclass;

import java.util.LinkedList;


/**
 *
 * @author 30039802 Caspian Maclean
 * 
 * 28/7/2021
 *
 * Program to create a doubly linked list of four countries with their capital cities
 * stored, and show them.
 *
 * Question 1 – You need to make a nested class that shows countries with cities
 * inside. These countries must be stored in a doubly linked list with no less
 * than four countries in it.
 *
 */
public class JavaNestedClass {

    public static void main(String[] args) {
        LinkedList<Country> countries = new LinkedList<>();

        countries.add(new Country("France", "Paris"));
        countries.add(new Country("Australia", "Canberra"));
        countries.add(new Country("New Zealand", "Wellington"));
        countries.add(new Country("Japan", "Tokyo"));

        for(Country country: countries) {
            System.out.println(country.displayCountry());
        }
    }

}
