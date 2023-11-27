/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.routethirdtask;

import java.util.ArrayList;
import newpackage.Movie;
import newpackage.holiday;

/**
 *
 * @author ahmed
 */
public class RouteThirdTASK {
    
    public static void main(String[] args) {
        //task No 1
        holiday ArrOfHolidays_Day = new holiday("ArrOfHolidays Day", 4, "July");
        
        //last task
        Movie CasinoRoyale = new Movie("Casino Royale", "Eon Productions", "PG");
         Movie CasinoRoyale1 = new Movie("Casino Royale", "Eon Productions", "PG13");
         Movie CasinoRoyale2 = new Movie("Casino Royale", "Eon Productions", "PG");
         Movie CasinoRoyale3 = new Movie("Casino Royale", "Eon Productions", "PG13");
         ArrayList<Movie> FilteredMovieList = new ArrayList<>();
         FilteredMovieList.add(CasinoRoyale);
         FilteredMovieList.add(CasinoRoyale1);
         FilteredMovieList.add(CasinoRoyale2);
         FilteredMovieList.add(CasinoRoyale3);
         Movie.getPG(FilteredMovieList);
 
    }
}
