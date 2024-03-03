package org.example.models;

import java.util.List;

public class Movie {
    private String title;
    private Director director;
    private List<Actor> actors;

    public Movie(String title, Director director, List<Actor> actors) {
        this.title = title;
        this.director = director;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director=" + director +
                ", actors=" + actors +
                '}';
    }
}