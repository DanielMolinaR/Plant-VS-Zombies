/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.io.Serializable;

/**
 *
 * @author cgpc2
 */
public class User implements Serializable{

    private String username, dni;
    private int points;
    private int sun_stored_end_game; // Se va a inicializar a cero siempre que empiece una partida. 
    private int plants_stored_end_game; // Se va a inicializar a cero siempre que empiece la partida.
    private int games_won;
    private int games_lost;
    
    public User(String username, String dni){
        this.username = username;
        this.dni = dni;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getSunStoredEndGame() {
        return sun_stored_end_game;
    }

    public void setSunStoredEndGame(int sun_stored_end_game) {
        this.sun_stored_end_game = sun_stored_end_game;
    }

    public int getPlantsStoredEndGame() {
        return plants_stored_end_game;
    }

    public void setPlantsStoredEndGame(int plants_stored_end_game) {
        this.plants_stored_end_game = plants_stored_end_game;
    }

    public int getGamesWon() {
        return games_won;
    }

    public void setGamesWon(int games_won) {
        this.games_won = games_won;
    }

    public int getGamesLost() {
        return games_lost;
    }

    public void setGamesLost(int games_lost) {
        this.games_lost = games_lost;
    }
    
    

    @Override
    public String toString() {
        return "User{" + "Username=" + username + ", DNI=" + dni + ", Points=" + points + '}';
    }
        
}