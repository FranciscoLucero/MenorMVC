/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model_Menor;
import View.View_Menor;

/**
 *
 * @author Mike
 */
public class Controller_Menor {
    
    Model_Menor model_menor;
    View_Menor view_menor;
    
    public Controller_Menor(Model_Menor model_menor, View_Menor view_menor){
        this.model_menor = model_menor;
        this.view_menor = view_menor;
        view_menor.jb_menor.addActionListener(e->jb_menor_click());
        initView();
}

    private void jb_menor_click() {
        model_menor.setN1(Integer.parseInt(view_menor.jtf_n1.getText()));
        model_menor.setN2(Integer.parseInt(view_menor.jtf_n2.getText()));
        model_menor.setN3(Integer.parseInt(view_menor.jtf_n3.getText()));
        model_menor.Menor();
        view_menor.jtf_menor.setText(String.valueOf(model_menor.getM()));
    }

    private void initView() {
        view_menor.jtf_n1.setText(String.valueOf(model_menor.getN1()));
        view_menor.jtf_n2.setText(String.valueOf(model_menor.getN2()));
        view_menor.jtf_n3.setText(String.valueOf(model_menor.getN3()));
        view_menor.jtf_menor.setText(String.valueOf(model_menor.getM()));
        view_menor.setVisible(true);
    }
}
