/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;
import java.awt.Color;
import javax.swing.JPanel;
/**
 *
 * @author Rasel
 */
public class SquarePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public SquarePanel(Color d){
		this.setBackground(d);
	}
	
	public void ChangeColor(Color d){
		this.setBackground(d);
		this.repaint();
	}
	
}

