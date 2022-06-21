/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Models.PlayerDataModel;
import Views.PlayerDataView;

/**
 *
 * @author Saranga
 */
public class AdominoController {
    
    PlayerDataModel m;
    PlayerDataView v;

    public AdominoController(PlayerDataModel m, PlayerDataView v) {
        this.m = m;
        this.v = v;
    }
    
   public void setName(String name){
   
       this.m.setPlayerName(name);
   } 
   
   public void setAge(int age){
       this.m.setPlayerAge(age);
   }
    
   
   public void updateView(){
       v.viewPlayerData(m.getPlayerName(),m.getPlayerAge());
   }
}
