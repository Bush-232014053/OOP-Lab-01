/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.movie;

/**
 *
 * @author pc
 */
   public class Movie {
   private String title;
   private String genre;
   private String leadActor;
   private String director;
   private int releaseYear;
   private double rating;
   private String review;

    public Movie(String title, String genre, String leadActor, String director, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.leadActor = leadActor;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;

        if (this.rating < 5) {
            this.review = "Not Good";
        } else {
            this.review = "Good";
        }
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("The Shawshank Redemption", "Drama", "Tim Robbins", "Frank Darabont", 1994, 9.3);
        Movie movie2 = new Movie("Transformers", "Action", "Shia LaBeouf", "Michael Bay", 2007, 3.8);

        System.out.println("Movie 1 Details:");
        System.out.println("Title: " + movie1.title);
        System.out.println("Genre: " + movie1.genre);
        System.out.println("Lead Actor: " + movie1.leadActor);
        System.out.println("Director: " + movie1.director);
        System.out.println("Release Year: " + movie1.releaseYear);
        System.out.println("Rating: " + movie1.rating);
        System.out.println("Review: " + movie1.review);

        System.out.println("\nMovie 2 Details:");
        System.out.println("Title: " + movie2.title);
        System.out.println("Genre: " + movie2.genre);
        System.out.println("Lead Actor: " + movie2.leadActor);
        System.out.println("Director: " + movie2.director);
        System.out.println("Release Year: " + movie2.releaseYear);
        System.out.println("Rating: " + movie2.rating);
        System.out.println("Review: " + movie2.review);
    }
}


    


