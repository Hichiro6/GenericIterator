package com.jordan.iterator;

/**
 * Created by Mariavelle Jordan on 19-01-17.
 */
public class ElementMusic {

    String title;
    String auteur;

    public ElementMusic(String title, String auteur) {
        this.title = title;
        this.auteur = auteur;
    }

    public String getTitle() {
        return title;
    }

    public String getAuteur() {
        return auteur;
    }

    @Override
    public String toString() {
        return "ElementMusic{" +
                "title='" + title + '\'' +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}
