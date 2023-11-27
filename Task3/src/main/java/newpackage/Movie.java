/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ahmed
 */
public class Movie {
    private String title;
    private String studio;
    private String rating;
    
// your code goes here

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
         this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public String getRating() {
        return rating;
    }
    
    public static ArrayList<Movie>  getPG(ArrayList<Movie> ListMovies ){
        ArrayList<Movie> FilteredMovieList = new ArrayList<>();
        for (int MovieIndex = 0; MovieIndex < ListMovies.size(); MovieIndex++) {
            if(ListMovies.get(MovieIndex).getRating()=="PG"){
                FilteredMovieList.add(ListMovies.get(MovieIndex));
            }
            
        }
        System.out.println(FilteredMovieList.size());
        return FilteredMovieList;
    }
    
}
