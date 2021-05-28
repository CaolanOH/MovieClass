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
public class MovieTest {
    public static void main (String[] args){
        // Movie one
        Movie one = new Movie();
        one.title = "Gone with the wind";
        one.genre = "Classic";
        one.rating = 4;
        
        // Movie two
        Movie two = new Movie();
        two.title = "Dallas Buyers Club";
        two.genre = "Drama";
        two.rating = 5;
        two.playIt();
        
        // Movie Three
        Movie three = new Movie();
        three.title = "Fight Club";
        three.genre = "Action";
        three.rating = 3;
        
        System.out.println("Title : " + one.title + "," + " The genre : " + one.genre + "," + " The rating is : " + one.rating);
        System.out.println("Title : " + two.title + "," + " The genre : " + two.genre + "," + " The rating is : " + two.rating);
        System.out.println("Title : " + three.title + "," + " The genre : " + three.genre + "," + " The rating : " + three.rating);
        
        
    }
}
