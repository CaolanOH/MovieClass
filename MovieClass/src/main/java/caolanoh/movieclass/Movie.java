/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caolanoh.movieclass;

/**
 *
 * @author caolanohagan
 */
public class Movie {
    String title;
    String genre;
    int rating;
    
    void playIt(){
        System.out.println("Now playing the movie... " + title);
    }
}
