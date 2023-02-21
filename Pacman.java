package pc.game;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class Pacman extends JFrame{
	
	public Pacman() {
		
		initUI();
		
	}
	
	private void initUI () {
		add(new Board());
		
		setTitle("Pacman");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(380,420);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			
			Pacman ex = new Pacman();
			ex.setVisible(true);
			
		    String filepath = "pacmanMusic.wav";
		    Board musicObject = new Board();
		    musicObject.playMusic(filepath);
			

	});
	}

}
