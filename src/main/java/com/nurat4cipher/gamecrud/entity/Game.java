package com.nurat4cipher.gamecrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name="games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name ="game_name")
    private String gameName;

    @Column(name="release_year")
    private String releaseYear;

    @Column(name="rating")
    private String rating;

    public Game(){

    }

    public Game(String gameName, String releaseYear, String rating) {
        this.gameName = gameName;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
