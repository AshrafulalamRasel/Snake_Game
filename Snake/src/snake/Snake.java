/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;


import javax.swing.JFrame;
/**
 *
 * @author Rasel
 */
public class Snake {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating the window with all its awesome snaky features
		Window f1= new Window();
		
		//Setting up the window settings
		f1.setTitle("Snake");
		f1.setSize(300,300);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    
}
