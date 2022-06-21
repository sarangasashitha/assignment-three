/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Saranga
 */
public class PlayerDataModel {
    
    String playerName;
    int playerAge;

    public PlayerDataModel(String playerName, int playerAge) {
        this.playerName = playerName;
        this.playerAge = playerAge;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }
    
    
}
