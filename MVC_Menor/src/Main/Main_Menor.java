/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Model.Model_Menor;
import View.View_Menor;
import Controller.Controller_Menor;

/**
 *
 * @author Mike
 */
public class Main_Menor {
    
    public static void main(String[] mike) {
        Model_Menor model_menor = new Model_Menor();
        View_Menor view_menor = new View_Menor();
        Controller_Menor controller_mayor = new Controller_Menor(model_menor, view_menor);
    }
}