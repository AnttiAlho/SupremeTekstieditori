/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tekstieditori.tekstieditori;

import javax.swing.JFrame;

/**
 *
 * @author Anttiwin7ProN
 */
public class Tekstieditori {
    public static void main(String[] args){
        if(args.length == 0){
            TextEditorFrame frame = new TextEditorFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        } else {
            System.out.println("Kesken!");
        }
    }
}
