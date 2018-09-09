//package MyrmidonChess;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class GUI{
	
	private JFrame frame;

	// Launch the application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	// Create the application
	public GUI() {
		initialize();
	}
	
	// Initialize the contents of the frame
	private void initialize() {
		frame = new JFrame("Myrmidon Chess");
		frame.setBounds(100, 50, 1500, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.X_AXIS));
		
		// Create a split pane
		JSplitPane splitPane = new JSplitPane();
		frame.getContentPane().add(splitPane);
		
		// Adjust splitPane;
		splitPane.setResizeWeight(0.8);
		// Insert chess board panel to the left of split pane
		splitPane.setLeftComponent(Board.insertPanel());
		
		// Insert player and game information to the right of split pane
		// ******** TO-DO ********
		// THIS IS JUST A STUB //
		splitPane.setRightComponent(GameInfo.insertGameInfoPanel());

		// THIS IS JUST A STUB //
		// ******** TO-DO ********
		
		// Insert JMenuBar
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu gameMenu = new JMenu("Game");
		menuBar.add(gameMenu);
		gameMenu.add(new JMenuItem("New Game"));
		gameMenu.add(new JMenuItem("Save Game"));
		gameMenu.add(new JMenuItem(new AbstractAction("Resign"){
                    public void actionPerformed(ActionEvent e){
                        int button = JOptionPane.YES_NO_OPTION;
                        int dialogResult = JOptionPane.showConfirmDialog(null, GameInfo.getCurrentTurn()+": resign?");
                        if(dialogResult == JOptionPane.YES_OPTION){
                            switch(GameInfo.getCurrentTurn()){
                                case "Red":
                                    JOptionPane.showMessageDialog(frame, "BLUE WON!"); 
                                    break;
                                case "Blue":
                                    JOptionPane.showMessageDialog(frame, "RED WON!"); 
                                    break;
                            }
                            Board.initialPosition();
                        }
                    }
        }));
		
		JMenuItem exitItem=new JMenuItem("Exit");
		gameMenu.add(exitItem);
		exitItem.addActionListener(new ActionListener(){
			//Exit Game after click on "Exit" 
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		JMenu helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		helpMenu.add(new JMenuItem("Tutorial"));
	}
}
