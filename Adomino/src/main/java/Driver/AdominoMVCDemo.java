/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import Controller.AdominoController;
import Models.PlayerDataModel;
import Views.PlayerDataView;

/**
 *
 * @author Saranga
 */
public class AdominoMVCDemo {
    
    public static void main(String[] args) {
        
        PlayerDataModel pdm = new PlayerDataModel("Sasika",10);
        PlayerDataView pdv = new PlayerDataView();
        
        AdominoController controller = new AdominoController(pdm,pdv);
        
        controller.updateView();
        
        
        
        
    }
    
}
