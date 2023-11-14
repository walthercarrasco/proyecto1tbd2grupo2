/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Proyecto;

import com.formdev.flatlaf.FlatDarkLaf;

public class Proyecto1tbd2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            javax.swing.UIManager.setLookAndFeel(new FlatDarkLaf());
            new Login().setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}