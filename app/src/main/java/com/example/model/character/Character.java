package com.example.model.character;

/**
 * Definition of a character containg his primary atributes and references to other data
 *
 * @author Lucas Andrade
 */
public class Character {

    /** Name of the character **/
    private String name;

    /** Biography of the character **/
    private String biography;

    /** Statuses of the character **/
    private CharacterStatus statuses;

    public Character(String name, String biography, CharacterStatus statuses){
        this.biography = biography;
        this.name = name;
        this.statuses = statuses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public CharacterStatus getStatus() {
        return this.statuses;
    }
}
