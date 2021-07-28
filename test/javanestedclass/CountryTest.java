/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanestedclass;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 30039802
 */
public class CountryTest {

    public CountryTest() {
    }

    /**
     * Test of getName method, of class Country.
     */
    @Test
    public void testGetName() {
        Country france = new Country("France", "Paris");
        String expected = "France";
        String actual = france.getName();
        assertEquals(expected, actual);
    }

    /**
     * Test of displayCountry method, of class Country.
     */
    @Test
    public void testDisplayCountry() {
        Country france = new Country("France", "Paris");
        String expected = "Country: France. Capital City: Paris";
        String actual = france.displayCountry();
        assertEquals(expected, actual);
    }

}
